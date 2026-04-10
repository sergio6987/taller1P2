package modelo.excepciones.checked;

import java.time.LocalDateTime;

public class CapacidadExcedidaException extends SistemaBancarioException {
	
	public CapacidadExcedidaException(String message, String codigoError, LocalDateTime timestamp, int capacidadMaxima) {
		super(message, codigoError, timestamp);
		this.capacidadMaxima = capacidadMaxima; 
	}

	private int capacidadMaxima;

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
}
