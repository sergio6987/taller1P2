package modelo.cuentas;

import modelo.abstractas.Cuenta;

public class CuentaCredito extends Cuenta{
	private double limiteCredito;
	private double tasaInteres;
	private double deudaActual;

	@Override
	public double calcularInteres() {
		throw new UnsupportedOperationException("Unimplemented method 'calcularInteres'");
	}

	@Override
	public double fetLimiteRetiro() {
		throw new UnsupportedOperationException("Unimplemented method 'fetLimiteRetiro'");
	}

	@Override
	public String getTipoCuenta() {
		throw new UnsupportedOperationException("Unimplemented method 'getTipoCuenta'");
	}
	
}
