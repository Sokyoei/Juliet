package com.ahri;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loggers {
    private static final Logger logger = LoggerFactory.getLogger(Loggers.class);

    public static void main(String[] args) {
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.trace("fatal");
    }
}
