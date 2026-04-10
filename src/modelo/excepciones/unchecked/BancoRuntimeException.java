package modelo.excepciones.unchecked;

public class BancoRuntimeException extends RuntimeException  {
	public BancoRuntimeException(String message) {
		super(message);
	}
}
