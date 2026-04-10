package modelo.empleados;

import modelo.abstractas.Empleado;

public class GerenteSucursal extends Empleado{
	private String sucursal;
	private double presupuestoAnual;
	private Empleado[] empleadosACargo = new Empleado[30];

	@Override
	public double calcularSalario() {
		throw new UnsupportedOperationException("Unimplemented method 'calcularSalario'");
	}

	@Override
	public double calcularBono() {
		throw new UnsupportedOperationException("Unimplemented method 'calcularBono'");
	}

	@Override
	public int calcularEdad() {
		throw new UnsupportedOperationException("Unimplemented method 'calcularEdad'");
	}

	@Override
	public String obtenerTipo() {
		throw new UnsupportedOperationException("Unimplemented method 'obtenerTipo'");
	}

	@Override
	public String obtenerDocumentoIdentidad() {
		throw new UnsupportedOperationException("Unimplemented method 'obtenerDocumentoIdentidad'");
	}
	
}
