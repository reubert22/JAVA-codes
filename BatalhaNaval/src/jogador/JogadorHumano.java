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
		criarEmbarcacao(3);
		
		System.out.println("Criando: Hidroavião");
		criarEmbarcacao(2);
		
		System.out.println("Criando: Cruzador");
		criarEmbarcacao(2);
		
		System.out.println("Criando: Encouraçado");
		criarEmbarcacao(1);
		
		System.out.println("Criando: Porta-avião");
		criarEmbarcacao(1);
	}
	
	private void criarEmbarcacao(int qntdEmbarcacoes){
		Scanner scanner = Utilidade.obterScanner();
		
		for(int cont = 0; cont < qntdEmbarcacoes; cont++){
			Posicao posicao = new Posicao();
			
			do {
				System.out.print("> Informe a linha e coluna: ");
				posicao.linha = scanner.nextInt();
				posicao.coluna = scanner.nextInt();
			} while(!tabuleiro.posicaoValida(posicao));
			
			tabuleiro.adicionarPeca(new Submarino(), posicao);
		}
	}
	
	public void pedirJogada(){
		// Lembrete: aqui é onde vamos usar a prop. "adversario"
	}
	
}
