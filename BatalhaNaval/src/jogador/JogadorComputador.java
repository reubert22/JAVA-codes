package jogador;

import java.util.Random;

import navio.Cruzador;
import navio.Encouracado;
import navio.Hidroaviao;
import navio.PortaAvioes;
import navio.Submarino;

import tabuleiro.*;
import utilidade.Utilidade;

public class JogadorComputador extends Jogador {
	
	public JogadorComputador(Tabuleiro tabuleiro){
		super(tabuleiro);
	}

	public void organizarEmbarcacoes(){
		System.out.println("Criando: Submarino");
		criarEmbarcacao(3,1);
		
		System.out.println("Criando: Hidroaviao");
		criarEmbarcacao(2,2);
		
		System.out.println("Criando: Cruzador");
		criarEmbarcacao(2,3);
		
		System.out.println("Criando: Encouracado");
		criarEmbarcacao(1,4);
		
		System.out.println("Criando: Porta-aviao");
		criarEmbarcacao(1,5);
	}
	
	public Posicao gerarPosicao(){
		Random random = Utilidade.obterRandom();
		int linha = random.nextInt(10);
		int coluna = random.nextInt(10);
		return new Posicao(linha, coluna);
	}
	
	public void criarEmbarcacao(int qntdEmbarcacoes, int tamEmbarcacao){
		for(int cont = 0; cont < qntdEmbarcacoes; cont++){
			Posicao posicao = new Posicao();
			
			do {
				posicao = gerarPosicao();
			} while(!tabuleiro.posicaoValida(posicao));
			
			if(tabuleiro.checaPosicoesLaterais(posicao, tamEmbarcacao)){
				if(tamEmbarcacao == 1){
					tabuleiro.adicionarPeca(new Submarino(), posicao);
				}else if(tamEmbarcacao == 2){
					tabuleiro.adicionarPeca(new Hidroaviao(), posicao);
				}else if(tamEmbarcacao == 3){
					tabuleiro.adicionarPeca(new Cruzador(), posicao);
				}else if(tamEmbarcacao == 4){
					tabuleiro.adicionarPeca(new Encouracado(), posicao);
				}else if(tamEmbarcacao == 5){
					tabuleiro.adicionarPeca(new PortaAvioes(), posicao);
				}
			}				
		}	
		
	}
	
	public void pedirJogada(){}
	
}
