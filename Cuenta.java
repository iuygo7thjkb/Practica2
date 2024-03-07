package practica2;

public class Cuenta {

	public int id;
	public int saldo;
	public Cliente cliente;
	
	public Cuenta(int id, int saldo, Cliente cliente) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getId() {
		return id;
	}

	public int getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}