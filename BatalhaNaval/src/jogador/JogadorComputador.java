package jogador;

import java.util.Random;

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
	
	public int gerarPrimeiraLinha(){
		Random random = Utilidade.obterRandom();
		int linha = random.nextInt(10);
		return linha;
	}
	
	public int gerarPrimeiraColuna(){
		Random random = Utilidade.obterRandom();
		int coluna = random.nextInt(10);
		return coluna;
	}
	
	public void criarEmbarcacao(int qntdEmbarcacoes, int tamEmbarcacao){
		int pontoLinha = gerarPrimeiraLinha();
		int pontoColuna = gerarPrimeiraColuna();
		//verificação das casas e for para preencher os lugares
		
	}
	
	public void pedirJogada(){}
	
}
