package jogador;

import java.util.Random;

import navio.*;
import tabuleiro.*;
import utilidade.Utilidade;

public class JogadorComputador extends Jogador {
	
	public JogadorComputador(Tabuleiro tabuleiro){
		super(tabuleiro);
	}
	
	public void mostrarPontos(){
		System.out.println("Pontuação Computador: "+pontos);
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
		int linha  = random.nextInt(10);
		int coluna = random.nextInt(10);
		//System.out.println("" + linha + " | " +  coluna);
		return new Posicao(linha, coluna);
	}
	
	public void realizarJogada(){
		Posicao posicao = new Posicao();
		Tabuleiro tabuleiroAdversario = adversario.getTabuleiro();
		
		do {
			posicao = gerarPosicao();
		} while(!tabuleiroAdversario.posicaoEstaDentroDoLimite(posicao) && tabuleiroAdversario.posicaoJaFoiUtilizada(posicao));
		

		if(tabuleiroAdversario.posicaoContemAgua(posicao)){
			System.out.println("O computador nao acertou nenhuma embarcacao sua. :)");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			return;
		}
		
		if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'S'){
			System.out.println("O computador acertou um Submarino.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'H'){
			System.out.println("O computador acertou um Hidroaviao.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'C'){
			System.out.println("O computador acertou um Cruzador.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'E'){
			System.out.println("O computador acertou um Encouracado.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'P'){
			System.out.println("O computador acertou um Porta-aviao.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			pontos++;
		}
	}
	
}
