/**
 * A intencao desta classe eh prover uma interface automatica 
 * para testes. Assim, nao eh preciso, em cada teste, informar 
 * uma infinidade de posicoes para cada embarcacao na hora de 
 * organiza-las.
 */

package jogador;

import navio.*;
import tabuleiro.*;

public class JogadorHumanoAutomatico extends JogadorHumano {

	public JogadorHumanoAutomatico(Tabuleiro tabuleiro){
		super(tabuleiro);
	}
	
	@Override
	public void organizarEmbarcacoes(){
		// Cria submarinos
		tabuleiro.adicionarEmbarcacao(new Submarino(), new Posicao(0, 5));
		tabuleiro.adicionarEmbarcacao(new Submarino(), new Posicao(0, 9));
		tabuleiro.adicionarEmbarcacao(new Submarino(), new Posicao(1, 3));
		
		// Cria hidroavioes
		tabuleiro.adicionarEmbarcacao(new Hidroaviao(), new Posicao(1, 0));
		tabuleiro.adicionarEmbarcacao(new Hidroaviao(), new Posicao(3, 0));
		
		// Cria cruzadores
		tabuleiro.adicionarEmbarcacao(new Cruzador(), new Posicao(3, 6));
		tabuleiro.adicionarEmbarcacao(new Cruzador(), new Posicao(5, 1));
		
		// Cria encouracado
		tabuleiro.adicionarEmbarcacao(new Encouracado(), new Posicao(8, 0));
		
		// Cria porta-aviao
		tabuleiro.adicionarEmbarcacao(new PortaAvioes(), new Posicao(9, 5));
	}
	
}
