package navio;

public abstract class Embarcacao {
	protected char simbolo;
	protected int tamanho; 
	
	public Embarcacao(char simbolo){
		this.simbolo = simbolo;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public char getSimbolo(){
		return simbolo;
	}
}
