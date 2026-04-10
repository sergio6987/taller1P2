package modelo.personas;

import modelo.abstractas.Cuenta;

public class ClienteEmpresarial extends Cliente{
	private String nit;
	private String razonSocial;
	private String representanteLegal;
	private Cuenta[] cuentas = new Cuenta[5];
	public String getNit() {
		return nit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public Cuenta[] getCuentas() {
		return cuentas;
	}
}
