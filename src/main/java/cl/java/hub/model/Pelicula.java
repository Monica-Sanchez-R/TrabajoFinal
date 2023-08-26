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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pelicula;

	@Column(length = 254)
	private String titulo;

	@Column(length = 4)
	private int anio_lanzamiento;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_genero")
	private Genero genero;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pelicula")
	@JsonIgnore
	private Set<Calificacion> calificacion = new HashSet<>();

	// constructore vacio

	public Pelicula() {
		super();
	}

	// get and set

	public Long getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(Long id_pelicula) {
		this.id_pelicula = id_pelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio_lanzamiento() {
		return anio_lanzamiento;
	}

	public void setAnio_lanzamiento(int anio_lanzamiento) {
		this.anio_lanzamiento = anio_lanzamiento;
	}


	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Set<Calificacion> getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Set<Calificacion> calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [id_pelicula=" + id_pelicula + ", titulo=" + titulo + ", anio_lanzamiento=" + anio_lanzamiento
				+ ", genero=" + genero + ", calificacion=" + calificacion + "]";
	}

}
