package cl.java.hub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.java.hub.model.Pelicula;
import cl.java.hub.repository.PeliculaRepository;
import cl.java.hub.service.PeliculaService;

@Service
public class PeliculaServiceImpl implements PeliculaService  {

	private final PeliculaRepository peliculaRepository;
	
	@Autowired
	public PeliculaServiceImpl(PeliculaRepository peliculaRepository) {
		super();
		this.peliculaRepository = peliculaRepository;
	}
	

	@Override
	@Transactional
	public Pelicula guardarPelicula(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}

	@Override
	@Transactional
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		return peliculaRepository.save(pelicula);
	}

	@Override
    @Transactional(readOnly = true)
	public List<Pelicula> obtenerPeliculas() {
		 return peliculaRepository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPelicula(Long id) {
		peliculaRepository.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Pelicula obtenerPeliculaPorId(Long id) {
		return peliculaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pelicula no fue encontrada"));
    }

	@Override
    public Pelicula obtenerPeliculaPorNombre(String nombre) {
        return peliculaRepository.findByTitulo(nombre);
    }

}
