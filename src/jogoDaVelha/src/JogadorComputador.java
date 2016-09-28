import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JogadorComputador {
	private List<Posicao> jogadas = new ArrayList<>();
	private char simbolo;
	
	public JogadorComputador(char simbolo){
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
	
	public void adicionarJogada(Posicao posicao){
		jogadas.add(posicao);
	}
	
	public Posicao escolherJogada(TabuleiroJogoVelha tabuleiro){
		boolean cond = false;
		int linha = 0;
		int coluna = 0;
		char tab[][] = tabuleiro.getTabuleiro();
		Posicao posicao;
		
		while(cond == false){
			Random rand = new Random();	
			linha = rand.nextInt(3);
			coluna = rand.nextInt(3);
			if(coluna >= 0 && linha >= 0 && coluna <= 2 && linha <= 2 
					&& tab[linha][coluna] == ' '){
				cond = true;
			}
		}
		
		posicao = new Posicao(linha,coluna);
		adicionarJogada(posicao);
		tabuleiro.setTabuleiro(linha, coluna, simbolo);
		
		return posicao;
	}
}