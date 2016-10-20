package tabuleiro;
import navio.*;

public class Tabuleiro {
	protected char tabuleiro[][];
	protected static final char SIMBOLO_AGUA = 'A';
	
	public Tabuleiro(){
		this.tabuleiro = new char[10][10];
	}
	
	public boolean adicionarPosicao(Embarcacao embarcacao, int linha, int coluna){
		if(tabuleiro[linha][coluna] != SIMBOLO_AGUA){
			tabuleiro[linha][coluna] = embarcacao.getSimbolo();
			return true;
		}
		return false;
	}
}
