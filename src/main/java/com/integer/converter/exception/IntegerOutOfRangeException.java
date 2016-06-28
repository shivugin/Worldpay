package com.integer.converter.exception;

public class IntegerOutOfRangeException extends Exception {
    
    public IntegerOutOfRangeException(String message) {
        super(message);
    }
    
    public IntegerOutOfRangeException(String message, Throwable throwable) {
        super(message, throwable);
    }
    
}
