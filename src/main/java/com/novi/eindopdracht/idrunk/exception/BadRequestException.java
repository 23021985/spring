package com.novi.eindopdracht.idrunk.exception;

public class BadRequestException extends Throwable {
    private static final long serialVersionUID = 1L;

    public BadRequestException() {
        super();
    }
    public BadRequestException(String message) {
        super(message);
    }

}
