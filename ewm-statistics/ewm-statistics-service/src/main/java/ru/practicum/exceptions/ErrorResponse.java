package ru.practicum.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ErrorResponse {
    private final String error;
    private String stackTrace;

    public ErrorResponse(String error) {
        this.error = error;
    }

    public ErrorResponse(String error, String stackTrace) {
        this.error = error;
        this.stackTrace = stackTrace;
    }

    public static ErrorResponse createErrorResponse(String error, Throwable throwable) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);

        return new ErrorResponse(
                error,
                sw.toString()
        );
    }

    public String getError() {
        return error;
    }

    public String getStackTrace() {
        return stackTrace;
    }
}