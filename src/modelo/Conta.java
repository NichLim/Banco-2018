package modelo;

public class Conta {
	//atributos
	private int numero;
	private double saldo;
	private double limite;
	private Cliente titular;
	
	//getters & setters
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transferir(Conta destino, double valor){
		boolean retirou = this.saca(valor);
		if(retirou == false) {
			//não deu para sacar
			return false;
		}
		else {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		
	}
	
}
