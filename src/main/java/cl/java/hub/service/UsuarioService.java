package cl.java.hub.service;

import java.util.List;

import cl.java.hub.model.Usuario;

public interface UsuarioService {

	Usuario guardarUsuario(Usuario usuario);

	Usuario actualizarUsuario(Usuario usuario);

	List<Usuario> obtenerUsuarios();
	
	void eliminarUsuario(Long id);
	
	Usuario obtenerUsuarioPorId(Long id);
	
	Usuario obtenerUsuarioPorNombre(String nombre);

	Usuario registro(String nombre, String contrasena);

}
