package com.elacazacu.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideIntNoExceptionHandling(int a, int b) {
        return a / b;
    }
    public static int divideIntWithExceptionHandling(int a, int b) {
        try{
            int result = a / b;
            return result;
        } catch (ArithmeticException capturedException) {
            System.out.println("Am exception has accurred:" + capturedException.getMessage());
            return 0;
        }
    }
}
