package com.javaBootCamp.input;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingDemo {
    private static Logger logger = Logger.getLogger(LoggingDemo.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.SEVERE);
        logger.info("This is just a sample info message");
        logger.warning("this is a sample warning message");
        System.out.println();
        logger.log(Level.INFO, "This is just for informational purposes");
        logger.log(Level.WARNING, "System threshold level is at 70%. Please make ADJUSTMENT before crossing the THRESHOLD");
        logger.log(Level.SEVERE, "System threshold level is at 90% CRITICAL LEVEL. Please make ADJUSTMENT SYSTEM crossed the THRESHOLD");

    }
}
