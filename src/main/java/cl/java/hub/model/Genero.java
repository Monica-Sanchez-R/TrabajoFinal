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
@Table(name = "generos")
public class Genero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_genero;

	@Column(length = 100)
	private String nombre_genero;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "genero")
	@JsonIgnore
	private Set<Pelicula> pelicula = new HashSet<>();

	//constructores
	
	public Genero() {
		super();
	}

	public Genero(Long id_genero, String nombre_genero, Set<Pelicula> pelicula) {
		super();
		this.id_genero = id_genero;
		this.nombre_genero = nombre_genero;
		this.pelicula = pelicula;
	}

	//get and set
	
	public Long getId_genero() {
		return id_genero;
	}

	public void setId_genero(Long id_genero) {
		this.id_genero = id_genero;
	}

	public String getNombre_genero() {
		return nombre_genero;
	}

	public void setNombre_genero(String nombre_genero) {
		this.nombre_genero = nombre_genero;
	}

	public Set<Pelicula> getPelicula() {
		return pelicula;
	}

	public void setPelicula(Set<Pelicula> pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "Genero [id_genero=" + id_genero + ", nombre_genero=" + nombre_genero + ", pelicula=" + pelicula + "]";
	}
	
}
