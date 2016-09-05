package primeiro;

/**
 * @author reubert
 */
public class Atribuicao {
    
	private Disciplina disciplina;
	private Professor professor;
	
	public Atribuicao(Disciplina disciplina,Professor professor){
		this.disciplina = disciplina;
		this.professor = professor;
	}
	
	public Disciplina getDisciplina(){
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina){
		this.disciplina = disciplina;
	}
	
	public Professor getProfessor(){
		return professor;
	}
	
	public void setProfessor(Professor professor){
		this.professor = professor;
	}
	
	public String toString(){
		return "Disciplina: "+disciplina+", Professor: "+professor+"\n";
	}
}
