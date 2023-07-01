package cl.datawise.musicpro.svcproductos.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ErrorMensajeDto {
    private HttpStatus status;
    private String message;
}
