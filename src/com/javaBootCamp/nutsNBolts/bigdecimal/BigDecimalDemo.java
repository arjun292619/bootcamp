package com.javaBootCamp.nutsNBolts.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Arrays;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double policyAmount = 100_000_000;
        int beneficiaries = 3;
        float percentageFloat = 1.0f / 3;
        double percentageDouble = 1.0 / 3;
        System.out.printf("Payout with float = %.2f%n", policyAmount * percentageFloat);
        System.out.printf("Payout with double= %.2f%n", policyAmount * percentageDouble);

        double totalDifferentialFloat = policyAmount - (policyAmount * percentageFloat * beneficiaries);
        double totalDifferentialDbl = policyAmount - (policyAmount * percentageDouble * beneficiaries);

        System.out.printf("totalDifferential with float = %.2f%n", totalDifferentialFloat);
        System.out.printf("totalDifferential with double = %.2f%n", totalDifferentialDbl);

        String[] decimalString = {"15.456", "8", "10000.000001", ".126896"};
        Double[] decimallDbl = {15.456, 8d, 10000.000001, .123896};
        BigDecimal[] bigDArray = new BigDecimal[decimalString.length];
        Arrays.setAll(bigDArray, i -> new BigDecimal(decimalString[i]));
        BigDecimal[] bigDbls = new BigDecimal[decimalString.length];
        Arrays.setAll(bigDbls, i -> BigDecimal.valueOf(decimallDbl[i]));
        System.out.printf("%14s %-15s %8s %s%n", "Value", "Unscaled value", "Scale", "Precision");
//        String template = String.format("%15s %-15d %8d %d %n" )

        System.out.printf("%14s %-15s %8s %s%n", "Value", "Unscaled value", "Scale", "Precision");
//        String template = String.format("%15s %-15d %8d %d %n" );
        System.out.println("-".repeat(50));
        for (BigDecimal bd : bigDbls) {
            System.out.printf("%15s %-15d %8d %d %n", bd, bd.unscaledValue(), bd.scale(), bd.precision());
        }
        System.out.println("-".repeat(50));
        BigDecimal testVal1 = new BigDecimal("1.111111111222222244444333333355555556663333");
        BigDecimal testVal2 = BigDecimal.valueOf(1.111111111222222244444333333355555556663333);
        System.out.printf("%15s %-15d %8d %d %n", testVal1, testVal1.unscaledValue(), testVal1.scale(), testVal1.precision());
        System.out.printf("%15s %-15d %8d %d %n", testVal2, testVal2.unscaledValue(), testVal2.scale(), testVal2.precision());
        System.out.println("-".repeat(50));
        for (BigDecimal bd : bigDArray) {
            bd = bd.setScale(2, RoundingMode.HALF_UP);
            System.out.printf("%15s %-15d %8d %d %n", bd, bd.unscaledValue(), bd.scale(), bd.precision());
        }

        System.out.println("-".repeat(50));
        BigDecimal policyPayout = new BigDecimal("100000000");
        System.out.printf("%15s %-15d %8d %d %n", policyPayout, policyPayout.unscaledValue(), policyPayout.scale(), policyPayout.precision());
        BigDecimal bdPercent = BigDecimal.ONE.divide(BigDecimal.valueOf(beneficiaries),MathContext.DECIMAL64);
        System.out.println(bdPercent);

        BigDecimal perPay = policyPayout.multiply(bdPercent);
        System.out.println(perPay);

        BigDecimal differential = policyPayout.subtract(perPay.multiply(BigDecimal.valueOf(beneficiaries)));
        differential = differential.setScale(7,RoundingMode.HALF_UP);
        System.out.printf("%15s %-15d %8d %d %n", differential, differential.unscaledValue(), differential.scale(), differential.precision());
    }
}
