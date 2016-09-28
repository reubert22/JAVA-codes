import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogadorHumano {
	private List<Posicao> jogadas = new ArrayList<>();
	private char simbolo;

	public JogadorHumano(char simbolo) {
		this.simbolo = simbolo;
	}

	public List<Posicao> getJogadas() {
		return jogadas;
	}

	public void setJogadas(List<Posicao> jogadas) {
		this.jogadas = jogadas;
	}

	public char getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;
	}

	public void adicionarJogadas(Posicao posicao) {
		jogadas.add(posicao);
	}

	public Posicao escolherJogada(TabuleiroJogoVelha tabuleiro) {
		Scanner lerJogadas = new Scanner(System.in);
		boolean cond = false;
		int linha = 0;
		int coluna = 0;
		char tab[][] = tabuleiro.getTabuleiro();
		Posicao posicao;
		
		while (cond != true) {
			
			System.out.print("Escolha a linha: ");
			linha = lerJogadas.nextInt();
			System.out.print("Escolha a coluna: ");
			coluna = lerJogadas.nextInt();
			
			if (coluna >= 0 && linha >= 0 && coluna <= 2 && linha <= 2
					&& tab[linha][coluna] == '%') {
				cond = true;
			}
		}
		//lerJogadas.close();
		
		tabuleiro.marcarJogada(linha, coluna, this.simbolo);
		posicao = new Posicao(linha, coluna);
		adicionarJogadas(posicao);
		
		
		return posicao;
		
	}
	
}
