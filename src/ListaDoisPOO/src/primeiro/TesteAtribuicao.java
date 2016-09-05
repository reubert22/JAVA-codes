package primeiro;

/**
 * @author reubert
 */
public class TesteAtribuicao {

	public static void main(String[] args) {
            
		Professor professor = new Professor("Reubert Barbosa", 20);
		Disciplina disciplina = new Disciplina("POO",true);
		Atribuicao atrib = new Atribuicao(disciplina, professor);
		
		System.out.println(atrib);
	}

}
