package com.bvan.oop.lessons5_6.exception;

/**
 * @author bvanchuhov
 */
public class NoMoneyException extends RuntimeException {

    public NoMoneyException(String message) {
        super(message);
    }

    public NoMoneyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoMoneyException(Throwable cause) {
        super(cause);
    }
}
