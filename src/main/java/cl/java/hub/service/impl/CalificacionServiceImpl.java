package cl.java.hub.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.hub.model.Calificacion;
import cl.java.hub.repository.CalificacionRepository;
import cl.java.hub.service.CalificacionService;

@Service
public class CalificacionServiceImpl implements CalificacionService  {

	private final CalificacionRepository calificacionRepository;

    @Autowired
    public CalificacionServiceImpl(CalificacionRepository calificacionRepository) {
        this.calificacionRepository = calificacionRepository;
    }
	

	@Override
	public Calificacion guardarCalificacion(Calificacion calificacion) {
		 return calificacionRepository.save(calificacion);
    }

	@Override
	public Calificacion actualizarCalificacion(Calificacion calificacion) {
		 return calificacionRepository.save(calificacion);
    }

	@Override
	public void eliminarCalificacion(Long id) {
		calificacionRepository.deleteById(id);
    }

	@Override
	public List<Calificacion> obtenerCalificaciones() {
		return calificacionRepository.findAll();
    }

	@Override
	public Calificacion obtenerCalificacionPorId(Long id) {
		return calificacionRepository.findById(id).orElseThrow(() -> new RuntimeException("Calificacion solicitada no encontrada"));
    }

}
