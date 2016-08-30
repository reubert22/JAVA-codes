package ExercicioUm;

public class Professor {
	private String nome;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }   
    
    public String toString(){
        return "Nome professor: "+nome+", idade: "+idade+"\n";
    }
}
==============================================================================
package ExercicioUm;

public class Disciplina {
	private String nome;
    private boolean pratica;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setPratica(boolean pratica){
        this.pratica = pratica;
    }
    
    public boolean getPratica(){
        return pratica;
    }
    
    public Disciplina(String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }
    
    public String toString(){
    	return "Nome disciplina: "+nome+", pratica: "+pratica+"\n";
    }
}
==============================================================================
package ExercicioUm;

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
		return "Disciplina: "+disciplina+", professor: "+professor+"\n";
	}
}
==============================================================================
package ExercicioUm;

public class TesteAtribuicao {

	public static void main(String[] args) {
		Professor professor = new Professor("Reubert Barbosa", 20);
		Disciplina disciplina = new Disciplina("POO",true);
		Atribuicao atrib = new Atribuicao(disciplina, professor);
		
		System.out.println(atrib.getProfessor()+" "+atrib.getDisciplina());
	}

}
