package modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Disciplina> disciplinas = new ArrayList();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public List<Disciplina> getDisciplinas(){
		return this.disciplinas;
	}
	
	public String getNome(){
		return this.nome;
	}
}
