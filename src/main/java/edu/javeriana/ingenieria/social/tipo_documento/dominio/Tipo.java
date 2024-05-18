package edu.javeriana.ingenieria.social.tipo_documento.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="tipo_documento")
public class Tipo {
    @Id
    private Integer id;
    private String tipo, descripcion;
}
