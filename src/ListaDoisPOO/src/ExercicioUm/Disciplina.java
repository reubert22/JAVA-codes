package ExercicioUm;

/**
 * @author reubert
 */
public class Disciplina {
    
    private String nome;
    private boolean pratica;
    
    public Disciplina(String nome, boolean pratica){
        this.nome = nome;
        this.pratica = pratica;
    }
    
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
    
    public String toString(){
    	return ""+nome+", Pratica: "+pratica;
    }
}
