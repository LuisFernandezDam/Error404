package uem.dam.m21.alumno;

import java.io.Serializable;

public class AlumnoOBJ implements Serializable {

	private static final long serialVersionUID = 1L;

	private String dni;
	private String nombre;
	private String calle;
	private int numero;
	private String ciudad;
	private String provincia;
	private int telefono;

	public AlumnoOBJ(String dni, String nombre, String calle, int numero, String ciudad,
			String provincia, int telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public int getTelefono() {
		return telefono;
	}

}

