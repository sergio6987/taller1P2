package modelo.cuentas;

import modelo.abstractas.Cuenta;

public class CuentaCorriente extends Cuenta {
	private double montoSobregiro;
	private double comisionMantenimiento;

	public double getMontoSobregiro() {
		return montoSobregiro;
	}

	public void setMontoSobregiro(double montoSobregiro) {
		this.montoSobregiro = montoSobregiro;
	}

	public double getComisionMantenimiento() {
		return comisionMantenimiento;
	}

	public void setComisionMantenimiento(double comisionMantenimiento) {
		this.comisionMantenimiento = comisionMantenimiento;
	}

	@Override
	public double calcularInteres() {
		throw new UnsupportedOperationException("Unimplemented method 'calcularInteres'");
	}

	@Override
	public double getLimiteRetiro() {
		throw new UnsupportedOperationException("Unimplemented method 'fetLimiteRetiro'");
	}

	@Override
	public String getTipoCuenta() {
		throw new UnsupportedOperationException("Unimplemented method 'getTipoCuenta'");
	}

}
