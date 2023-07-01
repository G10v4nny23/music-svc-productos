package cl.datawise.musicpro.svcproductos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.svcproductos.dto.SucursalDto;

@FeignClient(name="sucursal-db", url="${api_db_producto.baseUrl}/Sucursal")
public interface ISucursalCliente {
    
    @GetMapping("getById/{id}")
    RespuestaGenericaDto getSucursalById(@PathVariable int id);

    @GetMapping("getByNombre/{nombre}")
    RespuestaGenericaDto getSucursalByNombre(@PathVariable String nombre);

    @GetMapping("getByDireccion/{direccion}")
    RespuestaGenericaDto getSucursalByDireccion(@PathVariable String direccion);

    @GetMapping("getByPermisoMunicipal/{permisoMunicipal}")
    RespuestaGenericaDto getSucursalByPermisoMunicipal(@PathVariable String permisoMunicipal);

    @GetMapping("getByRut/{rut}")
    RespuestaGenericaDto getSucursalByRut(@PathVariable String rut);

    @GetMapping("getByIdEncargado/{idEncargado}")
    RespuestaGenericaDto getSucursalByIdEncargado(@PathVariable Integer idEncargado);

    @PostMapping("create")
    RespuestaGenericaDto createSucursal(@RequestBody SucursalDto sucursalDto);

    @PutMapping("update")
    RespuestaGenericaDto updateSucursal(@RequestBody SucursalDto sucursalDto);

    @DeleteMapping("delete/{id}")
    RespuestaGenericaDto deleteSucursal(@PathVariable int id);
    
}
