package cl.java.hub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.hub.model.Genero;
import cl.java.hub.repository.GeneroRepository;
import cl.java.hub.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService {

    private final GeneroRepository generoRepository;

    @Autowired
    public GeneroServiceImpl(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

	@Override
	public Genero guardarGenero(Genero genero) {
		return generoRepository.save(genero);
    }

	@Override
	public Genero actualizarGenero(Genero genero) {
		return generoRepository.save(genero);
    }

	@Override
	public List<Genero> obtenerGeneros() {
		return generoRepository.findAll();
    }

	@Override
	public void eliminarGenero(Long id) {
		generoRepository.deleteById(id);
    }

	@Override
	public Genero obtenerGeneroPorId(Long id) {
		return generoRepository.findById(id).orElseThrow(() -> new RuntimeException("Genero de pelicula no encontrado"));
    }

}
