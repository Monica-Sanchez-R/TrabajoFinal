package cl.java.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import cl.java.hub.model.Genero;

@Repository
@EnableJpaRepositories
public interface GeneroRepository extends JpaRepository<Genero, Long> {



}