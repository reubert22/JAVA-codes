package jogador;

import tabuleiro.*;
import utilidade.Utilidade;
import java.util.Scanner;
import navio.*;

public final class JogadorHumano extends Jogador {
	
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
	
	private void criarEmbarcacao(Fabrica fabrica, int quantidade) {
		Scanner scanner = Utilidade.obterScanner();
		
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
	
	public void pedirJogada(){
		// Lembrete: aqui e onde vamos usar a prop. "adversario"
	}
	
}
