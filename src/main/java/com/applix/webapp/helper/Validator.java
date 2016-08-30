package com.applix.webapp.helper;

public class Validator {
    
    public  static long isThisANumber(String paramValue)    {
        long number;

        try {
            number = Long.parseLong(paramValue);
        }
        catch(NumberFormatException nfe) {
            System.out.println("Exception caught = " + nfe.getMessage());
            number = -1;
        }
        return number;
    }

    public static boolean isThisAValidOperator(String paramOperator) {
        boolean operatorValid = false;
        if(
                (   
                    null != paramOperator &&
                    !("".equals(paramOperator))
                )   &&
                (
                    (paramOperator.equals("+")) ||
                    (paramOperator.equals("-")) ||
                    (paramOperator.equals("*")) ||
                    (paramOperator.equals("/"))
                )
          ) {
            operatorValid = true;
        }
        return operatorValid;
    }
}
