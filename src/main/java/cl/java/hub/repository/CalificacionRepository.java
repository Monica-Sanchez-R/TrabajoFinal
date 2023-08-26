package cl.java.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import cl.java.hub.model.Calificacion;

@Repository
@EnableJpaRepositories
public interface CalificacionRepository extends JpaRepository<Calificacion,Long> {


}