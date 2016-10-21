package jogador;

import tabuleiro.*;
import utilidade.Utilidade;
import java.util.Scanner;
import navio.*;

public class JogadorHumano extends Jogador {
	
	public JogadorHumano(Tabuleiro tabuleiro){
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
	
	private void criarEmbarcacao(int qntdEmbarcacoes, int tamEmbarcacao){
		Scanner scanner = Utilidade.obterScanner();
		
		for(int cont = 0; cont < qntdEmbarcacoes; cont++){
			Posicao posicao = new Posicao();
			System.out.print("> Informe a linha e coluna: ");
			posicao.linha = scanner.nextInt();
			posicao.coluna = scanner.nextInt();
			
			if(tabuleiro.posicaoValida(posicao) && tabuleiro.checaPosicoesLaterais(posicao, tamEmbarcacao)){
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
			}else{
				if(cont == 0){
					cont = 0;
				}else if(cont == 1){
					cont = 1;
				}else if(cont == 2){
					cont = 2;
				}
			}
			/*  do {
			*		System.out.print("> Informe a linha e coluna: ");
			*		posicao.linha = scanner.nextInt();
			*		posicao.coluna = scanner.nextInt();
			*	} while(!tabuleiro.posicaoValida(posicao));
			*	 
			*	tabuleiro.adicionarPeca(new Submarino(), posicao);
			*/	
		}
	}
	
	public void pedirJogada(){
		// Lembrete: aqui e onde vamos usar a prop. "adversario"
	}
	
}
