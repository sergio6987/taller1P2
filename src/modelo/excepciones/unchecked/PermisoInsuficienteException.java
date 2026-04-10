package modelo.excepciones.unchecked;

public class PermisoInsuficienteException extends BancoRuntimeException {

	public PermisoInsuficienteException(String message) {
		super(message);
	}

}
