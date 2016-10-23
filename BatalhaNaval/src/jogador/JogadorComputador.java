package jogador;

import java.util.Random;
import java.util.Scanner;

import navio.*;
import tabuleiro.*;
import utilidade.Utilidade;

public class JogadorComputador extends Jogador {
	
	public JogadorComputador(Tabuleiro tabuleiro){
		super(tabuleiro);
	}

	public void organizarEmbarcacoes(){
		criarEmbarcacao(new FabricaSubmarino(), 3);
		criarEmbarcacao(new FabricaHidroaviao(), 2);
		criarEmbarcacao(new FabricaCruzador(), 2);
		criarEmbarcacao(new FabricaEncouracado(), 1);
		criarEmbarcacao(new FabricaPortaAvioes(), 1);
	}
	
	public void criarEmbarcacao(Fabrica fabrica, int quantidade){
		for(int cont = 0; cont < quantidade; cont++){
			Posicao posicao = new Posicao();
			Embarcacao embarcacao = fabrica.criarEmbarcacao();
			
			do {
				posicao = gerarPosicao();
			} while(!tabuleiro.podeInserirEmbarcacao(embarcacao, posicao));
						
			tabuleiro.adicionarEmbarcacao(embarcacao, posicao);
		}
	}
	
	public Posicao gerarPosicao(){
		Random random = Utilidade.obterRandom();
		int linha = random.nextInt(10);
		int coluna = random.nextInt(10);
		return new Posicao(linha, coluna);
	}
	
	public void pedirJogada(){
		Scanner scanner = Utilidade.obterScanner();
		Posicao posicao = new Posicao();
		Tabuleiro tabuleiroAdversario = adversario.getTabuleiro();
		
		do {
			System.out.println("> Informe a linha e coluna do ataque: ");
			posicao.linha = scanner.nextInt();
			posicao.coluna = scanner.nextInt();
		} while(!tabuleiroAdversario.posicaoEstaDentroDoLimite(posicao));
		
		ultimaPosicaoJogada = posicao;
	}
	
}
