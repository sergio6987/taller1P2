package modelo.empleados;

import modelo.abstractas.Empleado;
import modelo.personas.Cliente;

public class AsesorFinanciero extends Empleado {

	private double comisionBase;
	private double metasMensuales;

	public double getComisionBase() {
		return comisionBase;
	}

	public void setComisionBase(double comisionBase) {
		this.comisionBase = comisionBase;
	}

	public double getMetasMensuales() {
		return metasMensuales;
	}

	public void setMetasMensuales(double metasMensuales) {
		this.metasMensuales = metasMensuales;
	}

	private Cliente[] clientesAsignados = new Cliente[20];

	public AsesorFinanciero(double comisionBase, double metasMensuales) {
		this.setComisionBase(comisionBase);
		this.setMetasMensuales(metasMensuales);
	}

	@Override
	public double calcularSalario() {
		return this.getSalarioBase() + (this.getComisionBase() > this.getMetasMensuales() ? this.getComisionBase() : 0);
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
		return "asesor financiero";
	}

	@Override
	public String obtenerDocumentoIdentidad() {
		return this.getId();
	}
}
