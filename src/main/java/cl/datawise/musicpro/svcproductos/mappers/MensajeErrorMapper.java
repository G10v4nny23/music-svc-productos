package cl.datawise.musicpro.svcproductos.mappers;

import cl.datawise.musicpro.svcproductos.dto.ErrorMensajeDto;
import org.springframework.http.HttpStatus;


public class MensajeErrorMapper {
        public static ErrorMensajeDto createMessage(HttpStatus code, String message) {
            return ErrorMensajeDto.builder()
                    .status(code)
                    .message(message)
                    .build();
        }
    }

