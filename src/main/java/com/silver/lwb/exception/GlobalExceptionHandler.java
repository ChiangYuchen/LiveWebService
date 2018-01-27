package com.silver.lwb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global Exception Handler
 *
 * @author Yuchen Chiang
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ResponseEntity handlerResourceNotFoundException(ResourceNotFoundException rnfe) {
        return new ResponseEntity(HttpStatus.BAD_GATEWAY);
    }
}
