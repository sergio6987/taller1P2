package modelo.excepciones.checked;

import java.time.LocalDateTime;

public class SaldoInsuficienteException extends SistemaBancarioException {

	public SaldoInsuficienteException(String message, String codigoError, LocalDateTime timestamp, double saldoActual,
			double montoSolicitado) {
		super(message, codigoError, timestamp);
		this.saldoActual = saldoActual;
		this.montoSolicitado = montoSolicitado;
	}

	private double saldoActual;
	private double montoSolicitado;

	public double getSaldoActual() {
		return saldoActual;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}
}
