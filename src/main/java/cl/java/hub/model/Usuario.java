package cl.java.hub.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;

	@Column(length = 100)
	private String nombreusuario;
	@Column(length = 100)
	private String correoelectronico;
	@Column(length = 254)
	private String contrasena;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "usuario")
	@JsonIgnore
	private Set<Calificacion> calificacion = new HashSet<>();

	// constructor vacio

	public Usuario() {
		super();
	}

	// get and set

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombreusuario() {
		return nombreusuario;
	}

	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Set<Calificacion> getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Set<Calificacion> calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombreusuario=" + nombreusuario + ", correoelectronico="
				+ correoelectronico + ", contrasena=" + contrasena + ", calificacion=" + calificacion + "]";
	}

}
