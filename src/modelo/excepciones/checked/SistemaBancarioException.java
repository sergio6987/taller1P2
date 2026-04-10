package modelo.excepciones.checked;

import java.time.LocalDateTime;

public class SistemaBancarioException extends Exception {
	public SistemaBancarioException(String message, String codigoError, LocalDateTime timestamp) {
		super(message);
		this.codigoError = codigoError;
		this.timestamp = timestamp;
	}
	
	private String codigoError;
	private LocalDateTime timestamp;
	public String getCodigoError() {
		return codigoError;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
}
