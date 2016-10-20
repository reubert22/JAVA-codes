import jogador.*;

public class Jogo {
	public static void main(String[] args){
		
		JogadorHumano humano = new JogadorHumano();
		JogadorComputador computador = new JogadorComputador();
		
		humano.pedirPosicoes();
		computador.pedirPosicoes();
	}
}
