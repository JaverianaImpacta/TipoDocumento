package edu.javeriana.ingenieria.social.tipo_documento.servicio;

import edu.javeriana.ingenieria.social.tipo_documento.dominio.Tipo;
import edu.javeriana.ingenieria.social.tipo_documento.repositorio.RepositorioTipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioTipo {
    @Autowired
    private RepositorioTipo repositorio;

    public List<Tipo> obtenerTipos(){
        return repositorio.findAll();
    }

    public Tipo obtenerTipo(String tipo){
        return repositorio.findOneByTipo(tipo);
    }

    public boolean tipoExiste(String tipo){
        return repositorio.existsByTipo(tipo);
    }
}
