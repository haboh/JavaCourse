package edu.hw2.Task4;

public class Task4 {
    private final static int CALLING_POSITION = 1;

    private Task4() {
    }

    public static CallingInfo callingInfo() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        return new CallingInfo(
            stackTrace[CALLING_POSITION].getClassName(),
            stackTrace[CALLING_POSITION].getMethodName()
        );
    }
}
