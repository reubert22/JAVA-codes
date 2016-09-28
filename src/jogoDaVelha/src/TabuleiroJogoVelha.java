
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
		System.out.print("-----------------------------");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print(tabuleiro[linha][coluna]+" ");
			}
			System.out.println( );
		}
		System.out.print("-----------------------------");
	}

	public boolean checarLinhas(char a) {
		boolean verif = false;
		int contador = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if (tabuleiro[linha][coluna] == a) {
					contador++;
				}
			}
		}
		if(contador == 3){
			verif = true;
		}
		return verif;
	}

	public boolean checaColuna(char a) {
		boolean verif = false;
		int contador = 0;
		for(int coluna = 0; coluna < 3; coluna++){
			for(int linha = 0; linha < 3; linha++){
				if(tabuleiro[linha][coluna] == a){
					contador++;
				}
			}
		}
		if(contador == 3){
			verif = true;
		}
		return verif;
	}

	public boolean checaDiagonalPrincipal(char a) {
		boolean verif = false;
		int contador = 0;
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][i] == a) {
				contador++;
			}
		}
		if (contador == 3) {
			verif = true;
		}
		return verif;
	}

	public boolean checaDiagonalSecundaria(char a) {
		boolean verif = false;
		int contador = 0;
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 2; coluna >= 0; coluna--) {
				if (tabuleiro[linha][coluna] == a) {
					contador++;
				}
			}
		}
		if (contador == 3) {
			verif = true;
		}
		return verif;
	}

	public boolean checarDiagonal(char a) {
		boolean verif = false;
		if (checaDiagonalPrincipal(a) == true || checaDiagonalSecundaria(a) == true) {
			verif = true;
		}
		return verif;
	}

	public boolean checaCasa(int i, int j) {
		boolean verif = false;
		if (tabuleiro[i][j] == ' ') {
			verif = true;
		}
		return verif;
	}

	public void marcarJogada(int i, int j, char a) {
		if (checaCasa(i,j) == true) {
			tabuleiro[i][j] = a;
		} else {
			System.out.println("A posição já está preenchida! ");
		}
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(int i, int j, char a) {
		this.tabuleiro[i][j] = a;
	}

}
