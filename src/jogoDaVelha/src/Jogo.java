import java.util.Random;

public class Jogo {
	public static void main(String[] args) {
		TabuleiroJogoVelha tabuleiro = new TabuleiroJogoVelha();
		/*The players have an default simbol*/
		JogadorHumano jogadorHumano = new JogadorHumano('X');
		JogadorComputador jogadorComputador = new JogadorComputador('O');
		
		boolean vencedor = false;
		int opcao = 0;
		
		tabuleiro.exibirTabuleiro();
		opcao = sorteiaJogador();
		
		//while(vencedor == false){
			if(opcao == 0){
				//Comeca por computador;
				System.out.println("1");
				jogadorComputador.escolherJogada(tabuleiro);
			}else{
				//Comeca por humano;
				System.out.println("2");
					jogadorHumano.escolherJogada(tabuleiro);
			}
			tabuleiro.exibirTabuleiro();
			alternarJogador(opcao);
		//}
		
		
	}
	
	public static int alternarJogador(int x){
		if(x == 0){
			x = 1;
		}else{
			x = 0;
		}
		return x;
	}
	
	public static int sorteiaJogador(){
		Random rand = new Random();
		int num = rand.nextInt(2);
		
		return num;
	}
	
}
