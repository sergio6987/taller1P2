package modelo.excepciones.unchecked;

public class EstadoTransaccionInvalidoException extends BancoRuntimeException{

	public EstadoTransaccionInvalidoException(String message) {
		super(message);
	}
	
}
