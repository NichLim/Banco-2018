package modelo;

public class Disciplina {
	private int cod;
	private String nome;
	
	public Disciplina(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
