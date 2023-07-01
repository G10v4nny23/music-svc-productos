package cl.datawise.musicpro.svcproductos.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private Integer id;
    private ProductoDto producto;
    private int id_sucursal;
    private int stock;
}