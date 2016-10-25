package tabuleiro;
import navio.*;

public abstract class Tabuleiro {
	protected static final char SIMBOLO_ACERTO = 'T';
	protected static final char SIMBOLO_ERRO = 'X';
	protected static final char SIMBOLO_AGUA = 'A';
	protected static final int NUM_LINHAS = 10;
	protected static final int NUM_COLUNAS = 10;
	
	protected char tabuleiro[][];
	protected boolean[][] ataquesRecebidos;
	
	public Tabuleiro(){
		this.tabuleiro = new char[10][10];
		this.ataquesRecebidos = new boolean[10][10];
		preencheTabuleiroComAgua();
	}
	
	public abstract void mostrar();
	
	protected void preencheTabuleiroComAgua(){
		for (int linha = 0; linha < NUM_LINHAS; linha++) {
			for (int coluna = 0; coluna < NUM_COLUNAS; coluna++) {
				tabuleiro[linha][coluna] = SIMBOLO_AGUA;
			}
		}
	}
	
	public boolean cabeEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		int tamanho = embarcacao.getTamanho();
		
		if(posicao.coluna + tamanho > 10){
			return false;
		}
		
		for(int coluna = posicao.coluna; coluna < (posicao.coluna + tamanho); coluna++){
			if(tabuleiro[posicao.linha][posicao.coluna] != SIMBOLO_AGUA){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean espacoEsquerdoEstaVazio(Posicao posicao){
		
		if(posicao.coluna == 0){
			return true;
		}
		return tabuleiro[posicao.linha][posicao.coluna - 1] == SIMBOLO_AGUA;
	}
	
	public boolean espacoDireitoEstaVazio(Embarcacao embarcacao, Posicao posicao){
		int linha = posicao.linha;
		int coluna = posicao.coluna;
		int tamanho = embarcacao.getTamanho();
		
		if(coluna == 9){
			return true;
		}
		
		if(coluna + tamanho > 9){
			return false;
		}
		
		return tabuleiro[linha][coluna + tamanho] == SIMBOLO_AGUA;
	}
	
	public void adicionarEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		if(podeInserirEmbarcacao(embarcacao, posicao)){
			for(int coluna = posicao.coluna; coluna < (posicao.coluna + embarcacao.getTamanho()); coluna++){
				tabuleiro[posicao.linha][coluna] = embarcacao.getSimbolo();
			}
		}
	}
	
	public boolean podeInserirEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		return 	posicaoEstaDentroDoLimite(posicao) && 
				cabeEmbarcacao(embarcacao, posicao) && 
				espacoEsquerdoEstaVazio(posicao) && 
				espacoDireitoEstaVazio(embarcacao, posicao);
	}
	
	public boolean posicaoEstaDentroDoLimite(Posicao posicao){
		int linha  = posicao.linha;
		int coluna = posicao.coluna;
		return linha >= 0 && linha < 10 && coluna >= 0 && coluna < 10;
	}
	
	public boolean posicaoContemAgua(Posicao posicao){
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
	
	public boolean posicaoJaFoiUtilizada(Posicao posicao){
		return ataquesRecebidos[posicao.linha][posicao.coluna] == true;
	}
	
	public void adicionarAtaqueRecebido(Posicao posicao){
		ataquesRecebidos[posicao.linha][posicao.coluna] = true;
	}
	
	public char[][] getTabuleiro(){
		return tabuleiro;
	}
	
	public boolean[][] getAtaquesRecebidos(){
		return ataquesRecebidos;
	}
}
