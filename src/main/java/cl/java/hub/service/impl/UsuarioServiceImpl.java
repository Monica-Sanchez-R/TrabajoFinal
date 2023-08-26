package cl.java.hub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.java.hub.model.Usuario;
import cl.java.hub.repository.UsuarioRepository;
import cl.java.hub.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService  {

	
	private final UsuarioRepository usuarioRepository;
	
	
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	
	@Override
	@Transactional
	public Usuario guardarUsuario(Usuario usuario) {
		 return usuarioRepository.save(usuario);
	}

	@Override
	@Transactional
	public Usuario actualizarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	 @Transactional(readOnly = true)
	public List<Usuario> obtenerUsuarios() {
		return usuarioRepository.findAll();
    }

	@Override
	public void eliminarUsuario(Long id) {
		usuarioRepository.deleteById(id);
    }

	@Override
	@Transactional
	public Usuario obtenerUsuarioPorId(Long id) {
		return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }

	@Override
	@Transactional(readOnly = true)
	public Usuario obtenerUsuarioPorNombre(String nombre) {
		return usuarioRepository.findByNombreusuario(nombre);
    }

	@Override
	public Usuario registro(String nombre, String contrasena) {
		return usuarioRepository.findByNombreusuarioAndContrasena(nombre, contrasena);
    }

}
