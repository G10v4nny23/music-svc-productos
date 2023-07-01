package cl.datawise.musicpro.svcproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.svcproductos.dto.CategoriaDto;
import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;

@FeignClient(name="categoria-db", url="${api_db_producto.baseUrl}/Categoria")
public interface ICategoriaCliente {
    
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getCategoriaById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getCategoriaByNombre(@PathVariable String nombre);

    @PostMapping("create")
    RespuestaGenericaDto createCategoria(@RequestBody CategoriaDto categoriaDto);

    @PutMapping("update")
    RespuestaGenericaDto updateCategoria(@RequestBody CategoriaDto categoriaDto);

    @DeleteMapping("delete/{id}")
    RespuestaGenericaDto deleteCategoria (@PathVariable int id);
    
}
