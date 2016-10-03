import java.util.Random;

public class Jogo {
	public static void main(String[] args) {

		TabuleiroJogoVelha tabuleiro = new TabuleiroJogoVelha();

		/* Jogadores tem um simbolo por padrão */
		JogadorHumano jogadorHumano = new JogadorHumano('X');
		JogadorComputador jogadorComputador = new JogadorComputador('O');

		boolean fimDoJogo = false;

		configuraTabuleiro(tabuleiro);
		tabuleiro.exibirTabuleiro();

		while (fimDoJogo == false) {

			System.out.println(".::Humano::.");
			jogadorHumano.escolherJogada(tabuleiro);
			if (checaVencedorHumano(tabuleiro) == true) {
				System.out.println("Humano venceu o jogo.");
				break;
			}

			if (tabuleiro.checaJogadas() == false) {
				System.out.print("Jogo empatado!");
				break;
			}

			System.out.println(".::Computador::.");
			jogadorComputador.escolherJogada(tabuleiro);
			if (checaVencedorHumano(tabuleiro) == true) {
				System.out.println("Humano venceu o jogo.");
				fimDoJogo = true;
				break;
			}
			tabuleiro.exibirTabuleiro();
		}
		tabuleiro.exibirTabuleiro();
	}

	public static boolean checaVencedorComputador(TabuleiroJogoVelha tabuleiro) {
		char simbolo = 'O';
		if (tabuleiro.checaColuna(simbolo) == true
				|| tabuleiro.checarLinhas(simbolo) == true
				|| tabuleiro.checaDiagonalPrincipal(simbolo) == true
				|| tabuleiro.checaDiagonalSecundaria(simbolo) == true) {
			return true;
		}
		return false;
	}

	public static boolean checaVencedorHumano(TabuleiroJogoVelha tabuleiro) {
		char simbolo = 'X';
		if (tabuleiro.checaColuna(simbolo) == true
				|| tabuleiro.checarLinhas(simbolo) == true
				|| tabuleiro.checaDiagonalPrincipal(simbolo) == true
				|| tabuleiro.checaDiagonalSecundaria(simbolo) == true) {
			return true;
		}
		return false;
	}

	public static void configuraTabuleiro(TabuleiroJogoVelha tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tabuleiro.setTabuleiro(i, j, '%');
			}
		}
	}

	public static int sorteiaJogador() {
		Random rand = new Random();
		int num = rand.nextInt(2);

		return num;
	}

}
