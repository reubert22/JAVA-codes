import jogador.*;
import tabuleiro.*;
import utilidade.Ferramentas;

public class BatalhaNaval {
	public static void main(String[] args){
		
		JogadorHumanoAutomatico humano = new JogadorHumanoAutomatico(new TabuleiroHumano());
		JogadorComputador computador = new JogadorComputador(new TabuleiroComputador());
		Ferramentas ferr = new Ferramentas();
		
		humano.setAdversario(computador);
		computador.setAdversario(humano);
		
		humano.organizarEmbarcacoes();
		computador.organizarEmbarcacoes();
		
		do {
			System.out.println("Seu tabuleiro: ");
			humano.mostrarPontos();
			humano.mostrarTabuleiro();
			
			System.out.println("Tabuleiro do computador: ");
			computador.mostrarPontos();
			computador.mostrarTabuleiro();
			
			ferr.limparTela();
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
