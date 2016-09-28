import java.util.Random;

public class Jogo {
	public static void main(String[] args) {
		
		TabuleiroJogoVelha tabuleiro = new TabuleiroJogoVelha();
		/* The players have an default symbol */
		JogadorHumano jogadorHumano = new JogadorHumano('X');
		JogadorComputador jogadorComputador = new JogadorComputador('O');

		boolean jogadorHumanoVenceu = false;
		boolean jogadorComputadorVenceu = false;
		boolean fimDoJogo = false;
		

		configuraTabuleiro(tabuleiro);
		tabuleiro.exibirTabuleiro();
		int opcao = sorteiaJogador();
		
		
		while (fimDoJogo == false) {

			/*
			 * System.out.print(".::Computador::.");
			 * jogadorComputador.escolherJogada(tabuleiro);
			 * if(checaVencedorComputador(tabuleiro)){
			 * System.out.println("Jogador computador venceu!");
			 * jogadorComputadorVenceu = true; fimDoJogo = true; break; }
			 */
			/*
			 * System.out.println(".::Humano::.");
			 * jogadorHumano.escolherJogada(tabuleiro); if
			 * (checaVencedorHumano(tabuleiro)) {
			 * System.out.println("Jogador humano venceu!"); jogadorHumanoVenceu
			 * = true; fimDoJogo = true; break; }
			 */
			alternarJogador(opcao);
			if(opcao == 0){
				System.out.println(".::Computador::.");
				jogadorComputador.escolherJogada(tabuleiro);
			}else if(opcao == 1){
				System.out.println(".::Humano::.");
				jogadorHumano.escolherJogada(tabuleiro);
			}else{
				System.out.println("Opção de jogador inválida!");
			}
			
			if(checaVencedorComputador(tabuleiro) == true){
				System.out.println("Computador venceu o jogo.");
				fimDoJogo = true;
				break;
			}else if(checaVencedorHumano(tabuleiro) == true){
				System.out.println("Humano venceu o jogo.");
				fimDoJogo = true;
				break;
			}else{
				System.out.println("acontecendo...");
			}
			tabuleiro.exibirTabuleiro();
			
		}
		
	}

	public static boolean checaVencedorComputador(TabuleiroJogoVelha tabuleiro) {
		char simbolo = 'O';
		boolean verif = false;
		if (tabuleiro.checaColuna(simbolo) || tabuleiro.checarLinhas(simbolo)
				|| tabuleiro.checaDiagonalPrincipal(simbolo)
				|| tabuleiro.checaDiagonalSecundaria(simbolo)) {
			verif = true;
		}
		return verif;
	}

	public static boolean checaVencedorHumano(TabuleiroJogoVelha tabuleiro) {
		char simbolo = 'X';
		boolean verif = false;
		if (tabuleiro.checaColuna(simbolo) || tabuleiro.checarLinhas(simbolo)
				|| tabuleiro.checaDiagonalPrincipal(simbolo)
				|| tabuleiro.checaDiagonalSecundaria(simbolo)) {
			verif = true;
		}
		return verif;
	}

	public static void configuraTabuleiro(TabuleiroJogoVelha tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro.setTabuleiro(i, j, '%');
			}
		}
	}
	
	public static int alternarJogador(int x) {
		if (x == 0) {
			x = 1;
		} else {
			x = 0;
		}
		return x;
	}
	
	public static int sorteiaJogador() {
		Random rand = new Random();
		int num = rand.nextInt(2);

		return num;
	}
	
}
