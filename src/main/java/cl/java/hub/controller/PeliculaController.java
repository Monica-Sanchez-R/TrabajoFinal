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

import cl.java.hub.model.Pelicula;
import cl.java.hub.service.PeliculaService;

@RestController
@RequestMapping("/api/v1/peliculas")
@CrossOrigin("*")
public class PeliculaController {

    private final PeliculaService peliculaService;

    @Autowired
    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @PostMapping("/")
    public ResponseEntity<Pelicula> guardarPelicula(@RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(peliculaService.guardarPelicula(pelicula));
    }

    @PutMapping("/")
    public ResponseEntity<Pelicula> actualizarPelicula(@RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(peliculaService.actualizarPelicula(pelicula));
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<Pelicula>> obtenerPeliculas() {
        return ResponseEntity.ok(peliculaService.obtenerPeliculas());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPelicula(@PathVariable("id") Long id) {
        peliculaService.eliminarPelicula(id);
        return ResponseEntity.ok("La pelicula fue eliminada correctamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> obtenerPeliculaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(peliculaService.obtenerPeliculaPorId(id));
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Pelicula> obtenerPeliculaPorNombre(@PathVariable("nombre") String nombre) {
        return ResponseEntity.ok(peliculaService.obtenerPeliculaPorNombre(nombre));
    }


}