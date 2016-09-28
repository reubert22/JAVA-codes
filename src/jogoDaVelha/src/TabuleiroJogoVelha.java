
public class TabuleiroJogoVelha {
	private char[][] tabuleiro = new char[3][3];
	
	public void tabuleiroJogoVelha(){
		zerarTabuleiro();
	}
	
	public void zerarTabuleiro(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				tabuleiro[i][j] = ' ';
			}
		}
	}
	
	public void exibirTabuleiro(){
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.println(tabuleiro[i][j]);
			}
		}
	}
	
	public boolean checarLinhas(char a){
		boolean verif = false;
		for(int i = 0; i<3; i++){
			if(tabuleiro[i][0] == a){
				if(tabuleiro[i][1] == a && tabuleiro[i][2] == a){
					verif = true;
				}
			}
		}
		return verif;
	}
	
	public boolean checaColuna(char a){
		boolean verif = false;
		for(int j = 0; j<3; j++){
			if(tabuleiro[0][j] == a){
				if(tabuleiro[1][j] == a && tabuleiro[2][j] == a){
					verif = true;
				}
			}
		}
		return verif;
	}
	
	public boolean checarDiagonal(char a){
		boolean verif = false;
		if(tabuleiro[0][0] == a && tabuleiro[1][1] == a && tabuleiro[2][2] == a){
			verif = true;
		}else if(tabuleiro[0][2] == a && tabuleiro[1][1] == a && tabuleiro[2][0] == a){
			verif = true;
		}
		return verif;
	}
	
	public void marcarJogada(int i, int j, char a){
		if(tabuleiro[i][j] == ' '){
			tabuleiro[i][j] = a;
		}else{
			System.out.println("A posição já está preenchida! ");
		}
	}
	
	public char[][] getTabuleiro(){
		return tabuleiro;
	}
	
	public void setTabuleiro(int i, int j, char a){
		this.tabuleiro[i][j] = a;
	}
	
}
