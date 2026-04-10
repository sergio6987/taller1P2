package modelo.cuentas;

import modelo.abstractas.Cuenta;

public class CuentaAhorros extends Cuenta{

	private double tasaInteres;
	private int retirosMesActual;
	private int maxRetirosMes;

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public int getRetirosMesActual() {
		return retirosMesActual;
	}

	public void setRetirosMesActual(int retirosMesActual) {
		this.retirosMesActual = retirosMesActual;
	}

	public int getMaxRetirosMes() {
		return maxRetirosMes;
	}

	public void setMaxRetirosMes(int maxRetirosMes) {
		this.maxRetirosMes = maxRetirosMes;
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
