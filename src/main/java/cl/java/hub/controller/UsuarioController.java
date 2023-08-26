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

import cl.java.hub.model.Usuario;
import cl.java.hub.service.UsuarioService;

@RestController
@RequestMapping("/api/v1/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    
    @PostMapping("/")
    public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.guardarUsuario(usuario));
    }
    
    @PutMapping("/")
    public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.actualizarUsuario(usuario));
    }

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> obtenerUsuarios() {
        return ResponseEntity.ok(usuarioService.obtenerUsuarios());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("id") Long id) {
        usuarioService.eliminarUsuario(id);
        return ResponseEntity.ok("El usuario fue eliminado correctamente");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(usuarioService.obtenerUsuarioPorId(id));
    }
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<Usuario> obtenerUsuarioPorNombre(@PathVariable("nombre") String nombre) {
        return ResponseEntity.ok(usuarioService.obtenerUsuarioPorNombre(nombre));
    }

    @GetMapping("/registro/{nombre}/{contrasena}")
    public ResponseEntity<Usuario> Login(@PathVariable("nombre") String nombre, @PathVariable("contrasena") String contrasena) {
        return ResponseEntity.ok(usuarioService.registro(nombre, contrasena));
    }

}