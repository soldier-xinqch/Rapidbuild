package com.rapidbuild.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RapidbuildLogApplication {

    private static final Logger logger = LogManager.getLogger(RapidbuildLogApplication.class.getName());

    public static void main(String[] args) {
        logger.trace("entity");
        logger.info("12312321321321321321312321321321312312312312312");
        logger.trace("exit");
    }
}
