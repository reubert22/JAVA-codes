import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JogadorHumano {
	private List<Posicao> jogadas = new ArrayList<>();
	//private int contPosicJogadas = 0;
	private char simbolo;
	
	public JogadorHumano(char simbolo) {
		this.simbolo = simbolo;
	}
	
	public List<Posicao> getJogadas(){
		return jogadas;
	}
	
	public void setJogadas(List<Posicao> jogadas){
		this.jogadas = jogadas;
	}
	
	public char getSimbolo(){
		return simbolo;
	}
	
	public void setSimbolo(char simbolo){
		this.simbolo = simbolo;
	}

	public void adicionarJogadas(Posicao posicao){
		jogadas.add(posicao);
	}
	
	public Posicao escolherJogada(TabuleiroJogoVelha tabuleiro){
		boolean cond = false;
		int linha = 0;
		int coluna = 0;
		char tab[][] = tabuleiro.getTabuleiro();
		Posicao posicao;
		while(cond == false){
			Scanner lerJogadas = new Scanner(System.in);
			System.out.println("Escolha a linha: ");
			linha = lerJogadas.nextInt();
			System.out.println("Escolha a coluna: ");
			coluna = lerJogadas.nextInt();
			if(coluna >= 0 && linha >= 0 && coluna <= 2 && linha <= 2 && tab[linha][coluna] == ' '){
				cond = true;
			}
			lerJogadas.close();
		}
		posicao = new Posicao(linha, coluna);
		adicionarJogadas(posicao);
		return posicao;
	}
	
}



















