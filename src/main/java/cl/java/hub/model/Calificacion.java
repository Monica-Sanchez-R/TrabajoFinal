package cl.java.hub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "calificaciones")
public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_calificacion;

	private int puntuacion;

	private String resena;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_pelicula")
	private Pelicula pelicula;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	// constrcutor vacio

	public Calificacion() {
		super();
	}

	// get and set

	public Long getId_calificacion() {
		return id_calificacion;
	}

	public void setId_calificacion(Long id_calificacion) {
		this.id_calificacion = id_calificacion;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getResena() {
		return resena;
	}

	public void setResena(String resena) {
		this.resena = resena;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Calificacion [id_calificacion=" + id_calificacion + ", puntuacion=" + puntuacion + ", resena=" + resena
				+ ", pelicula=" + pelicula + ", usuario=" + usuario + "]";
	}

}
