package tabuleiro;

public final class TabuleiroComputador extends Tabuleiro {

	public TabuleiroComputador(){
		super();
	}
	
	public void mostrar(){
		imprimeTitulo();
		imprimeConteudo();
	}
	
	private void imprimeTitulo(){
		System.out.print("    ");
		for(int i=0; i<10; i++){
			System.out.print("    ["+i+"]");
		}
		System.out.println();
	}
	
	private void imprimeConteudo(){
		for(int linha = 0; linha < 10; linha++){
			System.out.print("[" + linha + "]");
			
			for(int coluna = 0; coluna < 10; coluna++){
				if(!ataquesRecebidos[linha][coluna]){
					System.out.print("      " + "X");
				} else {
					System.out.print("      " + tabuleiro[linha][coluna]);
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
	}
}
