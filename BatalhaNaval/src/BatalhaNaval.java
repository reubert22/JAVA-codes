import jogador.*;
import tabuleiro.*;

public class BatalhaNaval {
	public static void main(String[] args){
		
		JogadorHumano humano = new JogadorHumano(new Tabuleiro());
		JogadorComputador computador = new JogadorComputador(new Tabuleiro());
		
		humano.setAdversario(computador);
		computador.setAdversario(humano);
		
		humano.organizarEmbarcacoes();
		computador.organizarEmbarcacoes();
		
		do {
			humano.mostrarTabuleiro();
			humano.pedirJogada();
			humano.atacarAdversario();
			
			computador.mostrarTabuleiro();
			computador.pedirJogada();
			computador.atacarAdversario();
		} while(!humano.vencedor() && !computador.vencedor());
		
		if(humano.vencedor()){
			System.out.println("Voce venceu!");
		} else if(computador.vencedor()){
			System.out.println("O computador venceu!");
		}
		
	}
}
