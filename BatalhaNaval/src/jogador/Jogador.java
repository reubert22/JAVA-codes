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
	
	public void mostrarTabuleiro(){
		for(int linha = 0; linha < 10; linha++){
			for(int coluna = 0; coluna < 10; coluna++){
				System.out.print(tabuleiro.getTabuleiro()[linha][coluna]);
			}
			
			System.out.println();
		}
	}
	
	public void atacarAdversario(){
		// Falta implementar
	}
	
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
