package com.social.social.advice;


import com.social.social.custom.exceptions.EmptyInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandling {

    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<String> emptyInputException (EmptyInputException emptyInputException){

        return new ResponseEntity<>("Inputs should not be empty", HttpStatus.BAD_REQUEST);
    }

}
