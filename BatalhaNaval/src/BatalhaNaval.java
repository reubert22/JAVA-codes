import jogador.*;
import tabuleiro.*;

public class BatalhaNaval {
	public static void main(String[] args){
		
		JogadorHumanoAutomatico humano = new JogadorHumanoAutomatico(new TabuleiroHumano());
		JogadorComputador computador = new JogadorComputador(new TabuleiroComputador());
		
		humano.setAdversario(computador);
		computador.setAdversario(humano);
		
		humano.organizarEmbarcacoes();
		computador.organizarEmbarcacoes();
		
		do {
			System.out.println("Seu tabuleiro: ");
			humano.mostrarTabuleiro();
			
			System.out.println("Tabuleiro do computador: ");
			computador.mostrarTabuleiro();
			
			humano.realizarJogada();
			computador.realizarJogada();
		} while(!humano.vencedor() && !computador.vencedor());
		
		if(humano.vencedor()){
			System.out.println("Voce venceu!");
		} else if(computador.vencedor()){
			System.out.println("O computador venceu!");
		}
		
	}
}
