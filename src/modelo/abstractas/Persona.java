package modelo.abstractas;

import java.time.LocalDate;

import modelo.excepciones.unchecked.DatoInvalidoException;

public abstract class Persona {
	private String id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String email;

	public void setId(String id) {
		if (id.isEmpty() || id == null) {
			throw new DatoInvalidoException("dato invalido", "campo id", id);
		}

		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if (fechaNacimiento.isAfter(LocalDate.now())) {
			throw new DatoInvalidoException("dato invalidp", "fecha de nacimiento", fechaNacimiento);
		}

		this.fechaNacimiento = fechaNacimiento;
	}

	public void setEmail(String email) {
		if (!email.contains("@")) {
			throw new DatoInvalidoException("dato invalido", "email", email);
		}
	}

	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public abstract int calcularEdad();

	public abstract String obtenerTipo();

	public abstract String obtenerDocumentoIdentidad();

	public String getNombreCompleto() {
		return String.format("%s %s", this.getNombre(), this.getApellido());
	}

}
