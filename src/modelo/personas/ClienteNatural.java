package modelo.personas;

import modelo.abstractas.Cuenta;
import modelo.enums.TipoDocumento;

public class ClienteNatural extends Cliente {
	private TipoDocumento tipoDocumento;
	private String numeroDocumento;
	private String nombre;
	private String apellido;

	private Cuenta[] cuentas = new Cuenta[5];

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
