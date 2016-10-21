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
	
	public boolean adicionarPeca(Embarcacao embarcacao, Posicao posicao){
		if(posicaoEstaDisponivel(posicao)){
			tabuleiro[posicao.linha][posicao.coluna] = embarcacao.getSimbolo();
			return true;
		}
		return false;
	}
	
	public boolean posicaoValida(Posicao posicao){
		return posicaoEstaDisponivel(posicao) && posicaoEstaDentroDoLimite(posicao);
	}
	
	public boolean posicaoEstaDisponivel(Posicao posicao){
		return tabuleiro[posicao.linha][posicao.coluna] == SIMBOLO_AGUA;
	}
	
	public boolean posicaoEstaDentroDoLimite(Posicao posicao){
		int linha = posicao.linha;
		int coluna = posicao.coluna;
		return linha >= 0 && linha < 10 && coluna >= 0 && coluna < 10;
	}
	
	public boolean checaPosicoesLaterais(Posicao posicao, int tamEmbarcacao){
		return tabuleiro[posicao.linha][posicao.coluna - 1] == SIMBOLO_AGUA && 
			   tabuleiro[posicao.linha][posicao.coluna + (tamEmbarcacao - 1) + 1] == SIMBOLO_AGUA;
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
}
