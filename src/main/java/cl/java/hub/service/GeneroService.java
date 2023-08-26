package cl.java.hub.service;

import java.util.List;

import cl.java.hub.model.Genero;

public interface GeneroService {
	
	Genero guardarGenero(Genero genero);

	Genero actualizarGenero(Genero genero);
	
	List<Genero> obtenerGeneros();

	void eliminarGenero(Long id);

	Genero obtenerGeneroPorId(Long id);
	
}
