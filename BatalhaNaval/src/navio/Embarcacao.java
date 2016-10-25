package navio;

public abstract class Embarcacao {
	protected char simbolo;
	protected int tamanho; 
	
	public Embarcacao(char simbolo, int tamanho){
		this.simbolo = simbolo;
		this.tamanho = tamanho;
	}
	
	public int getTamanho(){
		return tamanho;
	}
	
	public char getSimbolo(){
		return simbolo;
	}
}
