package cl.datawise.musicpro.svcproductos.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.datawise.musicpro.svcproductos.dto.CategoriaDto;
import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.svcproductos.exceptions.CategoriaException;
import cl.datawise.musicpro.svcproductos.services.CategoriaService;

@RestController
@RequestMapping("${api.base_url}/Categoria")
public class CategoriaController {
    private CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }

    @GetMapping("getById/{id}")
    ResponseEntity<RespuestaGenericaDto> getCategoriaById(@PathVariable int id) throws CategoriaException{
        return new ResponseEntity<>(categoriaService.getCategoriaById(id), HttpStatus.OK);
    }

    @GetMapping("getByNombre/{nombre}")
    ResponseEntity<RespuestaGenericaDto> getCategoriaByNombre(@PathVariable String nombre) throws CategoriaException{
        return new ResponseEntity<>(categoriaService.getCategoriaByNombre(nombre), HttpStatus.OK);
    }

    @GetMapping("create")
    ResponseEntity<RespuestaGenericaDto> createCategoria(@RequestBody CategoriaDto categoriaDto) throws CategoriaException{
        return new ResponseEntity<>(categoriaService.createCategoria(categoriaDto), HttpStatus.OK);
    }

    @GetMapping("update")
    ResponseEntity<RespuestaGenericaDto> updateCategoria(@RequestBody CategoriaDto categoriaDto) throws CategoriaException{
        return new ResponseEntity<>(categoriaService.updateCategoria(categoriaDto), HttpStatus.OK);
    }

    @GetMapping("delete/{id}")
    ResponseEntity<RespuestaGenericaDto> deleteCategoria(@PathVariable int id) throws CategoriaException{
        return new ResponseEntity<>(categoriaService.deleteCategoria(id), HttpStatus.OK);
    }
}
