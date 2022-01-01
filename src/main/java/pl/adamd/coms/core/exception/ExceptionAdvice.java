package pl.adamd.coms.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class ExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(StockNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String stockNotFoundException(StockNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String userNotFoundException(UserNotFoundException ex) {
        return ex.getMessage();
    }
}
