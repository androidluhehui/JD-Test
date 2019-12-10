package com.sxjs.common.model.http;

/**
 * Created by admin
 */

public class NoNetWorkException extends RuntimeException {
    public NoNetWorkException() {
    }

    public NoNetWorkException(String message) {
        super(message);
    }
}
