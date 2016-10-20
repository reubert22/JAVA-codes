package jogador;
import tabuleiro.*;

public abstract class Jogador {
	protected Tabuleiro tabuleiro;
	protected Jogador adversario;
	protected boolean vencedor;
	
	public Jogador(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
		this.vencedor = false;
	}
	
	public abstract void organizarEmbarcacoes();
	
	public abstract void pedirJogada();
	
	public void mostrarTabuleiro(){}
	
	public boolean vencedor(){
		return vencedor;
	}
	
	public void setTabuleiro(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
	}
	
	public void setAdversario(Jogador adversario){
		this.adversario = adversario;
	}
}
