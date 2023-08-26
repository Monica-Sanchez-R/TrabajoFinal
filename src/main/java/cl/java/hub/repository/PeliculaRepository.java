package cl.java.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import cl.java.hub.model.Pelicula;

@Repository
@EnableJpaRepositories
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    Pelicula findByTitulo(String titulo);
}