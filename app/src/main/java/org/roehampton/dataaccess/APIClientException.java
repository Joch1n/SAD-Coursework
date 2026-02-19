package org.roehampton.dataaccess;

public class APIClientException extends RuntimeException {

    public APIClientException(String msg) {
        super(msg);
    }

    public APIClientException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

