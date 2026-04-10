package modelo.abstractas;

import java.time.LocalDate;

import modelo.excepciones.unchecked.DatoInvalidoException;

public abstract class Empleado extends Persona {
	private String legado;
	private LocalDate fechaContratacion;
	private double salarioBase;
	private boolean activo;

	public String getLegado() {
		return legado;
	}

	public void setLegado(String legado) {
		this.legado = legado;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		if (fechaContratacion.isAfter(LocalDate.now())) {
			throw new DatoInvalidoException("dato invalido", "fecha contratacion", fechaContratacion);
		}

		this.fechaContratacion = fechaContratacion;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase < 0) {
			throw new DatoInvalidoException("dato invalido", "salario base", salarioBase);
		}

		this.salarioBase = salarioBase;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public abstract double calcularSalario();

	public abstract double calcularBono();

	public int calcularAntigúedad() {
		return LocalDate.now().getYear() - this.getFechaContratacion().getYear();
	}
}
