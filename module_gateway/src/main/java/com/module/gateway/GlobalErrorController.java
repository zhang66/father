package com.module.gateway;

import java.net.SocketTimeoutException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.AbstractErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import com.module.common.LogUtils;


@RestController
@RequestMapping("/error")
public class GlobalErrorController extends AbstractErrorController {
	private ErrorAttributes errorAttributes;
	public GlobalErrorController(ErrorAttributes errorAttributes) {
		super(errorAttributes);
		this.errorAttributes = errorAttributes;
	}

	@Override
	public String getErrorPath() {
	 LogUtils.Info("");
		 return "/error";
	}

	@RequestMapping()
	public Object error(HttpServletRequest request) {
		RequestAttributes requestAttributes = RequestContextHolder.currentRequestAttributes();
		Throwable error = errorAttributes.getError(requestAttributes);
		String message = "服务请求失败！";
		try {
			if (error.getCause().getCause().getCause() instanceof SocketTimeoutException) {
				message = "服务请求超时";
				return "操作成功，但是您久等了";
			}
		} catch (Exception e) {}
		return message;
	}

}
