package com.social.social.custom.exceptions;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputException extends RuntimeException {

    public static final long serialVersionUUID=1L;

    public EmptyInputException() {
        super();
    }

    private String  errorCode;
    private String errorMessage;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public EmptyInputException(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
