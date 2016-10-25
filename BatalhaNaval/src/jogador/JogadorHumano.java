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
		criarEmbarcacao(new FabricaSubmarino(), 3);
		
		System.out.println("Criando: Hidroaviao");
		criarEmbarcacao(new FabricaHidroaviao(), 2);
		
		System.out.println("Criando: Cruzador");
		criarEmbarcacao(new FabricaCruzador(), 2);
		
		System.out.println("Criando: Encouracado");
		criarEmbarcacao(new FabricaEncouracado(), 1);
		
		System.out.println("Criando: Porta-aviao");
		criarEmbarcacao(new FabricaPortaAvioes(), 1);
	}
	
	protected void criarEmbarcacao(Fabrica fabrica, int quantidade) {
		Scanner scanner = Utilidade.obterScanner();
		
		System.out.println("Voce vai escolher qual linha e coluna quer a embarcacao acima.");
		for(int cont = 0; cont < quantidade; cont++){
			Posicao posicao = new Posicao();
			Embarcacao embarcacao = fabrica.criarEmbarcacao();
			
			do {
				System.out.print("> Informe a linha e coluna: ");
				posicao.linha = scanner.nextInt();
				posicao.coluna = scanner.nextInt();
			} while(!tabuleiro.podeInserirEmbarcacao(embarcacao, posicao));
			
			tabuleiro.adicionarEmbarcacao(embarcacao, posicao);
		}
	}
	
	public void realizarJogada(){
		Scanner scanner = Utilidade.obterScanner();
		Posicao posicao = new Posicao();
		Tabuleiro tabuleiroAdversario = adversario.getTabuleiro();
		
		// Pede posicao de jogada
		do{
			System.out.println("> Informe a linha e coluna: ");
			posicao.linha  = scanner.nextInt();
			posicao.coluna = scanner.nextInt();
		} while(!tabuleiroAdversario.posicaoEstaDentroDoLimite(posicao) && !tabuleiroAdversario.posicaoJaFoiUtilizada(posicao));
		
		// Ataca tabuleiro do adversario e contabiliza pontos
		if(tabuleiroAdversario.posicaoContemAgua(posicao)){
			System.out.println("Voce nao acertou nenhuma embarcacao. :(");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			return;
		}
		
		if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'S'){
			System.out.println("Voce acertou um Submarino.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			tabuleiroAdversario.adicionarAcertoEmbarcacao(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'H'){
			System.out.println("Voce acertou um Hidroaviao.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			tabuleiroAdversario.adicionarAcertoEmbarcacao(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'C'){
			System.out.println("Voce acertou um Cruzador.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			tabuleiroAdversario.adicionarAcertoEmbarcacao(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'E'){
			System.out.println("Voce acertou um Encouracado.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			tabuleiroAdversario.adicionarAcertoEmbarcacao(posicao);
			pontos++;
		} else if(tabuleiroAdversario.getTabuleiro()[posicao.linha][posicao.coluna] == 'P'){
			System.out.println("Voce acertou um Porta-aviao.");
			tabuleiroAdversario.adicionarAtaqueRecebido(posicao);
			tabuleiroAdversario.adicionarAcertoEmbarcacao(posicao);
			pontos++;
		}
	}

}
