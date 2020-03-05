package me.diegoospina.webapi.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(int number) {
        super("Invalid number to convert : " + number);
    }
}
