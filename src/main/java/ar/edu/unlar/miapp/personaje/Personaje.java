package ar.edu.unlar.miapp.personaje;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personaje")
public class Personaje {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nombre;

	@Column(name = "nombre_real")
	private String nombreReal;

	private boolean tipo;

	public Personaje() {
	}

	public Personaje(Long id)

	{
		this.id = id;
	}

	public Personaje(Long id, String nombre, String nombreReal, boolean tipo) {
		this.id = id;
		this.nombre = nombre;
		this.nombreReal = nombreReal;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

}
