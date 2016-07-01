package co.craft.testtask.controller;

import co.craft.testtask.service.exception.PostServiceException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by ylauresh on 7/1/16.
 */
@ControllerAdvice
public class PostExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = { PostServiceException.class, Exception.class })
    protected ResponseEntity<Object> handleConflict(PostServiceException ex, WebRequest request) {
        return handleExceptionInternal(ex, ex.getMessage(),
                new HttpHeaders(), HttpStatus.valueOf(ex.getErrorCode().getNumberValue()), request);
    }
}
