package jogador;
import tabuleiro.*;

public abstract class Jogador {
	protected Tabuleiro tabuleiro;
	
	public Jogador(){}
	
	public abstract void pedirPosicoes();
	
	public void setTabuleiro(Tabuleiro tabuleiro){
		this.tabuleiro = tabuleiro;
	}
}
