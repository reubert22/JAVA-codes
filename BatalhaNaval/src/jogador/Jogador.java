package jogador;
import tabuleiro.*;

public abstract class Jogador {
	protected Tabuleiro tabuleiro;
	protected Posicao[][] ataquesRecebidos;
	protected Jogador adversario;
	protected Posicao ultimaPosicaoJogada;
	protected boolean vencedor;
	protected int pontos;
	
	public Jogador(Tabuleiro tabuleiro){
		this.ataquesRecebidos = new Posicao[10][10];
		this.tabuleiro = tabuleiro;
		this.vencedor = false;
		this.pontos = 0;
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
		
	}
	
	public void receberAtaque(){
		
	}
	
	public boolean vencedor(){
		return vencedor;
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
