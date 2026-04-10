package modelo.excepciones.checked;

import java.time.LocalDateTime;

public class ClienteNoEncontradoException extends SistemaBancarioException{
	public ClienteNoEncontradoException(String message, String codigoError, LocalDateTime timestamp, String idCliente) {
		super(message, codigoError, timestamp);
		this.idCliente = idCliente;
	}

	private String idCliente;

	public String getIdCliente() {
		return idCliente;
	}
}
