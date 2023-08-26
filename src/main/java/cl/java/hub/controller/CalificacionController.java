package cl.java.hub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.java.hub.model.Calificacion;
import cl.java.hub.service.CalificacionService;

@RestController
@RequestMapping("/api/v1/calificacion")
@CrossOrigin("*")
public class CalificacionController {

    private final CalificacionService calificacionService;

    @Autowired
    public CalificacionController(CalificacionService calificacionService) {
        this.calificacionService = calificacionService;
    }

    @PostMapping("/")
    public ResponseEntity<Calificacion> guardarCalificacion(@RequestBody Calificacion calificacion) {
        return ResponseEntity.ok(calificacionService.guardarCalificacion(calificacion));
    }

    @PutMapping("/")
    public ResponseEntity<Calificacion> actualizarCalificacion(@RequestBody Calificacion calificacion) {
        return ResponseEntity.ok(calificacionService.actualizarCalificacion(calificacion));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarCalificacion(@PathVariable("id") Long id) {
        calificacionService.eliminarCalificacion(id);
        return ResponseEntity.ok("La calificacion fue eliminada correctamente");
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Calificacion>> obtenerCalificaciones() {
        return ResponseEntity.ok(calificacionService.obtenerCalificaciones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calificacion> obtenerCalificacionPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(calificacionService.obtenerCalificacionPorId(id));
    }

}