package com.silver.lwb.exception;

/**
 * ResourceNotFoundException
 *
 * @author Yuchen Chiang
 */
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 201621010508L;

    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
