package modelo.banco;

import java.time.LocalDate;
import java.time.LocalDateTime;

import modelo.abstractas.Cuenta;
import modelo.abstractas.Empleado;
import modelo.excepciones.checked.CapacidadExcedidaException;
import modelo.excepciones.checked.ClienteNoEncontradoException;
import modelo.personas.Cliente;
import modelo.personas.ClienteEmpresarial;
import modelo.personas.ClienteNatural;

public class Banco {
	private static int numeroClientesRegistrados = 0;
	private static int numeroEmpleadosRegistrados = 0;
	private static int numeroCuentasRegistradas = 0;
	private String nombre;

	private Empleado[] empleados = new Empleado[50];
	private Cliente[] clientes = new Cliente[200];
	private Cuenta[] cuentas = new Cuenta[500];

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public Empleado[] getEmpleados() {
		return empleados;
	}

	public Cliente[] getClientes() {
		return clientes;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void registrarCliente(Cliente c) throws CapacidadExcedidaException {
		if (numeroClientesRegistrados < clientes.length) {
			clientes[numeroClientesRegistrados] = c;
			numeroClientesRegistrados++;
		} else {
			throw new CapacidadExcedidaException("capacidad de clientes excedida", "321", LocalDateTime.now(),
					clientes.length);
		}
	}

	public void registrarEmpleado(Empleado e) throws CapacidadExcedidaException {
		if (numeroEmpleadosRegistrados < empleados.length) {
			empleados[numeroEmpleadosRegistrados] = e;
			numeroEmpleadosRegistrados++;
		} else {
			throw new CapacidadExcedidaException("capacidad de empleados excedida", "321", LocalDateTime.now(),
					empleados.length);
		}
	}

	public void abrirCuenta(String idCliente, Cuenta c) throws CapacidadExcedidaException, ClienteNoEncontradoException {
		buscarCliente(idCliente);

		if (numeroCuentasRegistradas < cuentas.length) {
			cuentas[numeroCuentasRegistradas] = c;
			numeroCuentasRegistradas++;
		} else {
			throw new CapacidadExcedidaException("capacidad de cuentas excedida", "321", LocalDateTime.now(),
					cuentas.length);
		}
	}

	public Cliente buscarCliente(String id) throws ClienteNoEncontradoException {
		Cliente cliente = null;
		for (Cliente c : clientes) {
			if (((ClienteNatural) c).getNumeroDocumento().equals(id) || ((ClienteEmpresarial) c).getNit().equals(id)) {
				cliente = c;
				break;
			}
		}

		if (cliente == null) {
			throw new ClienteNoEncontradoException("cliente no encontrado", "322", LocalDateTime.now(), id);
		}

		return cliente;
	}

	public double calcularNominaTotal() {
	}

	public void calcularInteresesMensuales() {

	}
}
