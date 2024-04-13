package com.NIT.tokensCheck.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
@ControllerAdvice
public class ControllerExceptionHandler<ErrorMessage> {
    @ExceptionHandler(EmployeeIdnotFound.class)
    public ResponseEntity<ErrorMessage> resourceNotFoundException(EmployeeIdnotFound ex, WebRequest request) {
        ErrorMessage message = (ErrorMessage) new com.NIT.tokensCheck.Exception.ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                ex.getMessage(),
                request.getDescription(false));

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
    }




}
