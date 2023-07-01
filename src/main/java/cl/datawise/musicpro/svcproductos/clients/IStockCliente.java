package cl.datawise.musicpro.svcproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.svcproductos.dto.StockDto;

@FeignClient(name="stock-db", url="${api_db_producto.baseUrl}/Stock")
public interface IStockCliente {

    @GetMapping("getById/{id}")
    RespuestaGenericaDto getStockById(@PathVariable int id);

    @GetMapping("getByProducto/{id}")
    RespuestaGenericaDto getStockByProducto(@PathVariable int id);

    @GetMapping("getBySucursal/{id}")
    RespuestaGenericaDto getStockBySucursal(@PathVariable int id);

    @GetMapping("getByCantidad/{cantidad}")
    RespuestaGenericaDto getStockByCantidad(@PathVariable int cantidad);

    @PostMapping("create")
    RespuestaGenericaDto createStock(@RequestBody StockDto stockDto);

    @PutMapping("update")
    RespuestaGenericaDto updateStock(@RequestBody StockDto stockDto);

    @DeleteMapping("delete/{id}")
    RespuestaGenericaDto deleteStock(@PathVariable int id);

}
