package br.unibh.teste;

import br.unibh.universidade.*;

public class TesteAtribuicao {

	public static void main(String[] args) {
		
		Professor professor = new Professor("Reubert", 20);
		Disciplina disciplina = new Disciplina("Informática", true);
		Atribuicao atrib = new Atribuicao(professor, disciplina);
		
		System.out.println("Dados < "+atrib.toString()+" >");
	}

}
