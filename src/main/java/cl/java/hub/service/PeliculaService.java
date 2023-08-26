package cl.java.hub.service;

import java.util.List;

import cl.java.hub.model.Pelicula;

public interface PeliculaService {

	Pelicula guardarPelicula(Pelicula pelicula);

	Pelicula actualizarPelicula(Pelicula pelicula);
	
	List<Pelicula> obtenerPeliculas();

	void eliminarPelicula(Long id);
	
	Pelicula obtenerPeliculaPorId(Long id);
	
	Pelicula obtenerPeliculaPorNombre(String nombre);

}
