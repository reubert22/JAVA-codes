package jogador;
import tabuleiro.*;

public abstract class Jogador {
	protected Tabuleiro tabuleiro;
	protected Jogador adversario;
	protected Posicao ultimaPosicaoJogada;
	protected int pontos;
	
	public Jogador(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		this.pontos = 0;
	}
	
	public abstract void organizarEmbarcacoes();
	
	public abstract void realizarJogada();
	
	public void mostrarTabuleiro(){
		System.out.print("    ");
		for(int i=0; i<10; i++){
			System.out.print("    ["+i+"]");
		}
		System.out.println();
		for(int linha = 0; linha < 10; linha++){
			System.out.print("["+linha+"]");
			for(int coluna = 0; coluna < 10; coluna++){
				System.out.print("      "+tabuleiro.getTabuleiro()[linha][coluna]);
			}
			System.out.println();
		}
	}
	
	public boolean vencedor(){
		return pontos >= 24; // alterar este 24 depois
	}
	
	public boolean posicaoJaFoiUtilizada(Posicao posicao){
		return tabuleiro.getAtaquesRecebidos()[posicao.linha][posicao.coluna] == false;
	}
	
	public void setTabuleiro(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
	}
	
	public Tabuleiro getTabuleiro(){
		return tabuleiro;
	}
	
	public void setAdversario(Jogador adversario){
		this.adversario = adversario;
	}
}
