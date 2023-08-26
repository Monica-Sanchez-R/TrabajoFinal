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

import cl.java.hub.model.Genero;
import cl.java.hub.service.GeneroService;

@RestController
@RequestMapping("/api/v1/generos")
@CrossOrigin("*")
public class GeneroController {

	private final GeneroService generoService;

	@Autowired
	public GeneroController(GeneroService generoService) {
		this.generoService = generoService;
	}

	@GetMapping("/")
	public ResponseEntity<List<Genero>> obtenerGeneros() {
		return ResponseEntity.ok(generoService.obtenerGeneros());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Genero> obtenerGeneroPorId(@PathVariable("id") Long id) {
		return ResponseEntity.ok(generoService.obtenerGeneroPorId(id));
	}

	@PostMapping("/")
	public ResponseEntity<Genero> guardarGenero(@RequestBody Genero genero) {
		return ResponseEntity.ok(generoService.guardarGenero(genero));
	}

	@PutMapping("/")
	public ResponseEntity<Genero> actualizarGenero(@RequestBody Genero genero) {
		return ResponseEntity.ok(generoService.actualizarGenero(genero));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarGenero(@PathVariable("id") Long id) {
		generoService.eliminarGenero(id);
		return ResponseEntity.ok("Genero eliminado correctamente");
	}
}