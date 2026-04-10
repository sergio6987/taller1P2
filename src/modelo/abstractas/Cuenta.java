package modelo.abstractas;

import java.time.LocalDateTime;

import modelo.banco.Transaccion;
import modelo.excepciones.checked.CapacidadExcedidaException;
import modelo.excepciones.checked.CuentaBloqueadaException;

public abstract class Cuenta {
	private int cuentaHistorial;
	private int numeroCuenta;
	private double saldo;
	private boolean bloqueada;
	private LocalDateTime fechaCreacion;
	private LocalDateTime usuarioModificacion;
	private static Transaccion[] historial = new Transaccion[20];

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isBloqueada() {
		return bloqueada;
	}

	public void setBloqueada(boolean bloqueada) {
		this.bloqueada = bloqueada;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(LocalDateTime usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public abstract double calcularInteres();

	public abstract double getLimiteRetiro();

	public abstract String getTipoCuenta();

	public void verificarBloqueada() throws CuentaBloqueadaException {
		if (this.isBloqueada()) {
			throw new CuentaBloqueadaException("cuenta bloqueada", "320", LocalDateTime.now());
		}
	}

	public void agregarAlHistorial(Transaccion t) throws CapacidadExcedidaException {
		if (cuentaHistorial < historial.length) {
			historial[cuentaHistorial] = t;
			cuentaHistorial++;
		} else {
			throw new CapacidadExcedidaException("capacidad del historial excedida", "322", LocalDateTime.now(),
					historial.length);
		}
	}

	public Transaccion[] getHistorial() {
		Transaccion[] copiaHistorial = new Transaccion[20];
		System.arraycopy(historial, 0, copiaHistorial, 0, historial.length);
		return copiaHistorial;
	}
}
