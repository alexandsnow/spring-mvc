package com.alex.realm.exception;

/**
 * Created by alex on 2017/5/1.
 */
public class RealmException extends RuntimeException {

    public RealmException() {
    }

    public RealmException(String message) {
        super(message);
    }

    public RealmException(String message, Throwable cause) {
        super(message, cause);
    }
}
