package edu.javeriana.ingenieria.social.tipo_documento.repositorio;

import edu.javeriana.ingenieria.social.tipo_documento.dominio.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioTipo extends JpaRepository<Tipo, Integer> {
    Tipo findOneByTipo(String tipo);

    boolean existsByTipo(String tipo);
}
