package com.module.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtils {

	private static Logger log = LoggerFactory.getLogger(LogUtils.class);

	public static void Error(String msg) {
		log.error(msg);
	}

	public static void Info(String msg) {
		log.info(msg);
	}

}
