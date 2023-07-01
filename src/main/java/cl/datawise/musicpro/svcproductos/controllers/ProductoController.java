package cl.datawise.musicpro.svcproductos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.datawise.musicpro.svcproductos.dto.ProductoDto;
import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.svcproductos.exceptions.ProductoException;
import cl.datawise.musicpro.svcproductos.services.ProductoService;

@RestController
@RequestMapping("${api.baseUrl}/Producto")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<RespuestaGenericaDto> getProductoById(@PathVariable int id) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoById(id), HttpStatus.OK);
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByNombre(@PathVariable String nombre) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByNombre(nombre), HttpStatus.OK);
    }

    @GetMapping("getByPrecio/{precio}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByPrecio(@PathVariable int precio) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByPrecio(precio), HttpStatus.OK);
    }

    @GetMapping("getByCategoria/{idCategoria}")
    public ResponseEntity<RespuestaGenericaDto> getProductoByCategoria(@PathVariable int idCategoria) throws ProductoException{
        return new ResponseEntity<>(productoService.getProductoByCategoria(idCategoria), HttpStatus.OK);
    }

    @GetMapping("create")
    public ResponseEntity<RespuestaGenericaDto> createProducto(@RequestBody ProductoDto productoDto) throws ProductoException{
        return new ResponseEntity<>(productoService.createProducto(productoDto), HttpStatus.OK);
    }

    @GetMapping("update")
    public ResponseEntity<RespuestaGenericaDto> updateProducto(@RequestBody ProductoDto productoDto) throws ProductoException{
        return new ResponseEntity<>(productoService.updateProducto(productoDto), HttpStatus.OK);
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<RespuestaGenericaDto> deleteProducto(@PathVariable int id) throws ProductoException{
        return new ResponseEntity<>(productoService.deleteProducto(id), HttpStatus.OK);
    }
}
