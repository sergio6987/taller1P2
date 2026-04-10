package modelo.banco;

import java.time.LocalDateTime;

import modelo.abstractas.Cuenta;
import modelo.enums.EstadoTransaccion;

public class Transaccion {
	private String id;
	private Cuenta cuentaOrigen;
	private Cuenta cuentaDestino;
	private double monto;
	private EstadoTransaccion estado;
	private LocalDateTime fecha;
	private String descripcion;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public Cuenta getCuentaDestino() {
		return cuentaDestino;
	}

	public void setCuentaDestino(Cuenta cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public EstadoTransaccion getEstado() {
		return estado;
	}

	public void setEstado(EstadoTransaccion estado) {
		this.estado = estado;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void cambiarEstado(EstadoTransaccion nuevo) {

	}

	public String generarComprobante() {
		return "";
	}
}
