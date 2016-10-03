public class TabuleiroJogoVelha {
	private char[][] tabuleiro = new char[3][3];

	public void tabuleiroJogoVelha() {
		zerarTabuleiro();
	}

	public void zerarTabuleiro() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				tabuleiro[linha][coluna] = ' ';
			}
		}
	}

	public void exibirTabuleiro() {
		System.out.println("   0   1   2");
		for (int linha = 0; linha < 3; linha++) {
			System.out.print(linha + " ");
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("[" + tabuleiro[linha][coluna] + "] ");
			}
			System.out.println();
		}
		System.out.println("________________________");
	}

	public boolean checarLinhas(char a) {
		for (int linha = 0; linha < 3; linha++) {
			int contador = 0;
			for (int coluna = 0; coluna < 3; coluna++) {
				if (tabuleiro[linha][coluna] == a) {
					contador++;
				}
				if (contador == 3) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checaColuna(char a) {
		for (int coluna = 0; coluna < 3; coluna++) {
			int contador = 0;
			for (int linha = 0; linha < 3; linha++) {
				if (tabuleiro[linha][coluna] == a) {
					contador++;
				}
				if (contador == 3) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean checaDiagonalPrincipal(char a) {
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][i] != a) {
				return false;
			}
		}
		return true;
	}

	public boolean checaDiagonalSecundaria(char a) {
		for (int linha = 0, coluna = 2; linha < 3; linha++, coluna--) {
			if (tabuleiro[linha][coluna] != a) {
				return false;
			}
		}
		return true;
	}

	public boolean checaCasa(int i, int j) {
		boolean verif = false;
		if (tabuleiro[i][j] == '%') {
			verif = true;
		}
		return verif;
	}

	public void marcarJogada(int i, int j, char a) {
		if (checaCasa(i, j) == true) {
			tabuleiro[i][j] = a;
		} else {
			System.out.println("A posição já está preenchida! ");
		}
	}

	public boolean checaJogadas() {
		int contador = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tabuleiro[i][j] == '%') {
					contador++;
				}
				if (contador >= 1) {
					return true;
				}
			}
		}
		return false;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(int i, int j, char a) {
		this.tabuleiro[i][j] = a;
	}

}
