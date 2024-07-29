package com.gustavohenrique.todosimple.exceptions;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class ErrorResponse {
    private final int status;
    private final String messsage;
    private String stackTrace;
    private List<ValidationError> errors;

    private static class ValidationError{
        //private final String field;
        //private final String message;
    }
}
