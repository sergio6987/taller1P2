package modelo.excepciones.checked;

import java.time.LocalDateTime;

public class CuentaBloqueadaException extends SistemaBancarioException {

	public CuentaBloqueadaException(String message, String codigoError, LocalDateTime timestamp) {
		super(message, codigoError, timestamp);
	}
}
