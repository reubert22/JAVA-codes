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
		tabuleiro.mostrar();
	}
	
	public boolean vencedor(){
		return pontos >= 24; // alterar este 24 depois
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
