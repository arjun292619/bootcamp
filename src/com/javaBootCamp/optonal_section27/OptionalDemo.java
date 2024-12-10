package com.javaBootCamp.optonal_section27;

import java.util.Optional;
import java.util.Random;

public class OptionalDemo {
    public static void main(String[] args) {
        String msg = getMessage();
//        System.out.println(msg.toUpperCase());

        Optional<String> optionalMsg = getMessageWthOptional();
        if (optionalMsg.isPresent()) System.out.println(optionalMsg.get());
        else System.out.println("No value detected");
        ;
    }

    private static String getMessage() {
        int randomInt = new Random().nextInt(1, 100);
        if (randomInt % 2 == 0) {
            return "random message";
        }
        return null;
    }

    private static Optional<String> getMessageWthOptional() {
        int randomInt = new Random().nextInt(1, 100);
        System.out.println(randomInt);
        String msg = null;
        if (randomInt % 2 == 0) {
            msg = "random even optional message";
        }
        return Optional.ofNullable(msg);
    }
}
