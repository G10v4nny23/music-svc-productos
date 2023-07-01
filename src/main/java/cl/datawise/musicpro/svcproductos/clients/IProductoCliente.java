package cl.datawise.musicpro.svcproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.svcproductos.dto.ProductoDto;
import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;

@FeignClient(name="producto-db", url="${api_db_producto.baseUrl}/Producto")
public interface IProductoCliente {
    
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getProductoById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getProductoByNombre(@PathVariable String nombre);

    @GetMapping("getByPrecio/{precio}")
    RespuestaGenericaDto getProductoByPrecio(@PathVariable int id);

    @GetMapping("getByIdCategoria/{idCategoria}")
    RespuestaGenericaDto getProductoByCategoria(@PathVariable int idCategoria);

    @PostMapping("create")
    RespuestaGenericaDto createProducto(@RequestBody ProductoDto productoDto);

    @PutMapping("update")
    RespuestaGenericaDto updateProducto(@RequestBody ProductoDto productoDto);

    @DeleteMapping("delete/{id}")
    RespuestaGenericaDto deleteProducto(@PathVariable int id);
}

