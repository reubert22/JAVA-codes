package tabuleiro;
import navio.*;

public class Tabuleiro {
	protected static final char SIMBOLO_AGUA = 'A';
	protected static final int NUM_LINHAS = 10;
	protected static final int NUM_COLUNAS = 10;
	
	protected char tabuleiro[][];
	
	public Tabuleiro(){
		this.tabuleiro = new char[10][10];
		preencheTabuleiroComAgua();
	}
	
	protected void preencheTabuleiroComAgua(){
		for (int linha = 0; linha < NUM_LINHAS; linha++) {
			for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
				tabuleiro[linha][coluna] = SIMBOLO_AGUA;
			}
		}
	}
	
	public boolean podeInserirEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		return 	posicaoEstaDentroDoLimite(posicao) && 
				cabeEmbarcacao(embarcacao, posicao) && 
				espacoEsquerdoEstaVazio(posicao) && 
				espacoDireitoEstaVazio(embarcacao, posicao);
	}
	
	public boolean cabeEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		for(int coluna = posicao.coluna; coluna < (posicao.coluna + embarcacao.getTamanho()); coluna++){
			if(tabuleiro[posicao.linha][posicao.coluna] != SIMBOLO_AGUA){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean posicaoEstaDentroDoLimite(Posicao posicao){
		int linha = posicao.linha;
		int coluna = posicao.coluna;
		return linha >= 0 && linha < 10 && coluna >= 0 && coluna < 10;
	}
	
	public boolean espacoEsquerdoEstaVazio(Posicao posicao){
		if(posicao.coluna == 0){
			return true;
		}
		return tabuleiro[posicao.linha][posicao.coluna - 1] == SIMBOLO_AGUA;
	}
	
	public boolean espacoDireitoEstaVazio(Embarcacao embarcacao, Posicao posicao){
		return tabuleiro[posicao.linha][posicao.coluna + embarcacao.getTamanho()] == SIMBOLO_AGUA;
	}
	
	public void adicionarEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		if(podeInserirEmbarcacao(embarcacao, posicao)){
			for(int coluna = posicao.coluna; coluna < (posicao.coluna + embarcacao.getTamanho()); coluna++){
				tabuleiro[posicao.linha][posicao.coluna] = embarcacao.getSimbolo();
			}
		}
	}
	
	public boolean posicaoEstaDisponivel(Posicao posicao){
		return tabuleiro[posicao.linha][posicao.coluna] == SIMBOLO_AGUA;
	}
	
	public boolean existePosicaoDisponivel(){
		for (int linha = 0; linha < NUM_LINHAS; linha++) {
			for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
				if(tabuleiro[linha][coluna] == SIMBOLO_AGUA){
					return true;
				}
			}
		}
		return false;
	}
	
	public char[][] getTabuleiro(){
		return tabuleiro;
	}
}
