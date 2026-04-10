package modelo.interfaces;

public interface Transaccionable {
	void depositar();

	void retirar();

	double calcularComision(double monto);

	double consultarSaldo();
}
