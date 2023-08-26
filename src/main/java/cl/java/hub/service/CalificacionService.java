package cl.java.hub.service;

import java.util.List;

import cl.java.hub.model.Calificacion;

public interface CalificacionService {
	
    Calificacion guardarCalificacion(Calificacion calificacion);

    Calificacion actualizarCalificacion(Calificacion calificacion);

    void eliminarCalificacion(Long id);

    List<Calificacion> obtenerCalificaciones();
    
    Calificacion obtenerCalificacionPorId(Long id);

}
