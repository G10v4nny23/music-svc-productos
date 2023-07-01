package cl.datawise.musicpro.svcproductos.exceptions;

import org.springframework.http.HttpStatus;

import lombok.Getter;

public class SucursalException extends Exception{
    @Getter private HttpStatus status;
    public SucursalException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
