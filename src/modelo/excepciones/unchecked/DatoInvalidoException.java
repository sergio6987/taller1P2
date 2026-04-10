package modelo.excepciones.unchecked;

public class DatoInvalidoException extends BancoRuntimeException {
	public DatoInvalidoException(String message, String campo, Object valorRecibido) {
		super(message);
		this.campo = campo;
		this.valorRecibido = valorRecibido;
	}

	private String campo;
	private Object valorRecibido;

	public String getCampo() {
		return campo;
	}

	public Object getValorRecibido() {
		return valorRecibido;
	}
}
