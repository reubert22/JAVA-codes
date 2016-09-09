package br.unibh.universidade;

public class Atribuicao {
	
	private Professor professor;
	private Disciplina disciplina;
	
	public Atribuicao(Professor professor, Disciplina disciplina){
		this.professor = professor;
		this.disciplina = disciplina;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
	public void setProfessor(Professor professor){
		this.professor = professor;
	}
	
	public Disciplina getDisciplina(){
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
	}
	
	public String toString(){
		return "Professor: "+professor+"| Disciplina: "+disciplina;
	}
}
