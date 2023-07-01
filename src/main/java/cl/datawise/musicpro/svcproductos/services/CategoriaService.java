package cl.datawise.musicpro.svcproductos.services;

import org.springframework.stereotype.Service;

import cl.datawise.musicpro.svcproductos.clients.ICategoriaCliente;
import cl.datawise.musicpro.svcproductos.dto.CategoriaDto;
import cl.datawise.musicpro.svcproductos.dto.RespuestaGenericaDto;
import cl.datawise.musicpro.svcproductos.exceptions.CategoriaException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoriaService {
    private final ICategoriaCliente __categoriaCliente;

    public RespuestaGenericaDto getCategoriaById(int id) throws CategoriaException{
        return __categoriaCliente.getCategoriaById(id);
    }

    public RespuestaGenericaDto getCategoriaByNombre(String nombre) throws CategoriaException{
        return __categoriaCliente.getCategoriaByNombre(nombre);
    }

    public RespuestaGenericaDto createCategoria(CategoriaDto categoriaDto) throws CategoriaException{
        return __categoriaCliente.createCategoria(categoriaDto);
    }

    public RespuestaGenericaDto updateCategoria(CategoriaDto categoriaDto) throws CategoriaException{
        return __categoriaCliente.updateCategoria(categoriaDto);
    }

    public RespuestaGenericaDto deleteCategoria(int id) throws CategoriaException{
        return __categoriaCliente.deleteCategoria(id);
    }

}