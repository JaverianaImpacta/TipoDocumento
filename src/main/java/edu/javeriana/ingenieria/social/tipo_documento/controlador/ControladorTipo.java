package edu.javeriana.ingenieria.social.tipo_documento.controlador;

import edu.javeriana.ingenieria.social.tipo_documento.dominio.Tipo;
import edu.javeriana.ingenieria.social.tipo_documento.servicio.ServicioTipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipoDocumentos")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorTipo {
    @Autowired
    private ServicioTipo servicio;

    @GetMapping("listar")
    public List<Tipo> obtenerTipos(){
        return servicio.obtenerTipos();
    }

    @GetMapping("obtener")
    public ResponseEntity<Tipo> obtenerTipo(@RequestParam String tipo){
        if(tipo == null || tipo.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.tipoExiste(tipo)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerTipo(tipo), HttpStatus.OK);
    }
}
