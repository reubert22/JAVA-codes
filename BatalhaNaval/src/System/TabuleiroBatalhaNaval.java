package System;

public class TabuleiroBatalhaNaval {

	private char[][] tabuleiro;
	private int numLinhas;
	private int numColunas;
	private char agua = 'A';

	public TabuleiroBatalhaNaval(int numLinhas, int numColunas) {
		tabuleiro = new char[numLinhas][numColunas];
		for (int linhas = 0; linhas < numLinhas; linhas++) {
			for (int colunas = 0; colunas < numColunas; colunas++) {
				tabuleiro[linhas][colunas] = agua;
			}
		}
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getNumLinhas() {
		return numLinhas;
	}

	public void setNumLinhas(int numLinhas) {
		this.numLinhas = numLinhas;
	}

	public int getNumColunas() {
		return numColunas;
	}

	public void setNumColunas(int numColunas) {
		this.numColunas = numColunas;
	}

	public void imprimirTabuleiroJogador(){
		
	}
	
	public void imprimirTabuleiroAdversario(){
		
	}
	public boolean insereEmbarcacaoTabuleiro(String nomeEmbarcacao, int tamEmbarcacao, int linhaInicial, int colunaInicial, int ate){
		while(colunaInicial != ate){
			
			colunaInicial++;
		}
		return false;
	}
	public boolean adicionarEmbarcacao(Embarcacao embarcacao, Posicao posicao){
		int linhaInicial = posicao.getLinha();
		int colunaInicial = posicao.getColuna();
		int tamEmbarcacao = embarcacao.getTamanho();
		int localDeAnalise = colunaInicial + tamEmbarcacao;
		
		if(tamEmbarcacao <= numColunas){
			if(colunaInicial >= 0 && (localDeAnalise - 1) <= numColunas &&
			   linhaInicial >= 0 && linhaInicial <= numLinhas){
				if(tabuleiro[linhaInicial][colunaInicial - 1] == agua &&
				   tabuleiro[linhaInicial][localDeAnalise] == agua){
					insereEmbarcacaoTabuleiro(embarcacao.getNome(), embarcacao.getTamanho(), linhaInicial, colunaInicial, localDeAnalise - 1);
				}
			}
		}
		return false;
	}
}
