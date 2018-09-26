package teste;

import modelo.Aluno;
import modelo.Disciplina;

public class Programa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno("Diego");
		Disciplina d1 = new Disciplina("POO1");
		Disciplina d2 = new Disciplina("Calculo1");
		Disciplina d3 = new Disciplina("Sistemas Operacionais");
		Disciplina d4 = new Disciplina("Sistemas Distribuidos");
		
		aluno.getDisciplinas().add(d1);
		aluno.getDisciplinas().add(d2);
		aluno.getDisciplinas().add(d3);
		
		
		for (Disciplina aux : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + aux.getNome());
		}
		
		
		
		
			
		

	}

}
