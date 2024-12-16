package com.javaBootCamp.exceptionHandling_section14;

import java.util.logging.Logger;

public class MultipleCatchDemo {
    private static final Logger logger = Logger.getLogger(MultipleCatchDemo.class.getName());

    public static void main(String[] args) {
        String input = "Hello";
        try {
            logger.info(input.toUpperCase());
            input = input.substring(0, 8);
        } catch (NullPointerException nex) {
            logger.severe("Null pointer exception has occured. Please check the variable");
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
            logger.severe("String index is out of bounds. Please check you index");
        } catch (Exception ex) {
            logger.severe("a general exception has occured");
        }
        System.out.println("Program continues");
    }
}
