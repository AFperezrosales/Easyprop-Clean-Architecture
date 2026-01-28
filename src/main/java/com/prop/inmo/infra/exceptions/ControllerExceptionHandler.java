package com.prop.inmo.infra.exceptions;


import com.prop.inmo.infra.dtos.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(UserAlreadyExistException.class)
    public ResponseEntity<Map<String,String>> userAlreadyExist(UserAlreadyExistException ex){

        Map<String,String> response = new HashMap<>();
        response.put("ERROR:", ex.getMessage());
        response.put("Message", "change your email or reset your password");
        return new ResponseEntity<>(response, HttpStatus.UNPROCESSABLE_CONTENT);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String, String>> userNotFound(UserNotFoundException ex){
        Map<String,String> response = new HashMap<>();
        response.put("ERROR: ", ex.getMessage() );
        response.put("Message: ", "User not found");
        return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
    }
}
