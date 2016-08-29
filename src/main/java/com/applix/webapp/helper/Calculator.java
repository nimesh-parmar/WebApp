package com.applix.webapp.helper;

public class Calculator {
    public static Long calculate(Long paramValue1, String paramOperator, Long paramValue2) {
        System.out.println("paramValue1 = " + paramValue1);
        System.out.println("paramOperator = " + paramOperator);
        System.out.println("paramValue2 = " + paramValue2);
        Long value = 0L;
        
        switch(paramOperator) {
            case "+":
                value = paramValue1 + paramValue2;
                break;
            case "-":
                value = paramValue1 - paramValue2;
                break;
            case "*":
                value = paramValue1 * paramValue2;
                break;
            case "/":
                value = paramValue1 / paramValue2;
                break;
        }
        return value;
    }
}
