package cl.java.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import cl.java.hub.model.Usuario;

@Repository
@EnableJpaRepositories
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByNombreusuario(String nombreusuario);

	Usuario findByNombreusuarioAndContrasena(String nombreusuario, String contrasena);

}