package cl.datawise.musicpro.svcproductos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {
    private Integer id;
    private String nombre;
    private String uri_imagen;
    private String descripcion;
    private int precio;
    private CategoriaDto categoria;
}
