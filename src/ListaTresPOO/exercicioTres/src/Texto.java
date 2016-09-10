package src;

public class Texto {
	
	public int contarVogais(String palavra){
		int quantVogais = 0;
		String vogaisMin = "aeiou";
		String vogaisMai = "AEIOU";
		for(int i=0; i<palavra.length();i++){
			for(int j=0; j<vogaisMin.length(); j++){
				if(palavra.charAt(i) == vogaisMin.charAt(j) || palavra.charAt(i) == vogaisMai.charAt(j)){
					quantVogais += 1;
				}
			}
		}
		return quantVogais;
	}
	
	public String conjugarVerbo(String verbo){
		int infinitivo = 2;
		return "Verbo:"+verbo+
			   "\nEu: " +verbo.substring(0, verbo.length()-infinitivo)+"o"+
			   "\nTu: "  +verbo.substring(0, verbo.length()-infinitivo)+"as"+
			   "\nEle: " +verbo.substring(0, verbo.length()-infinitivo)+"a"+
			   "\nN�s: " +verbo.substring(0, verbo.length()-infinitivo+1)+"mos"+
			   "\nV�s: " +verbo.substring(0, verbo.length()-infinitivo)+"ais"+
			   "\nEles: "+verbo.substring(0, verbo.length()-infinitivo)+"am";
	}
	
	public String obterInverso(String palavra){
		String palavraInversa = "";
		char vetorCaracter[] = palavra.toCharArray();
		for(int i=vetorCaracter.length - 1; i >= 0; i--){
			palavraInversa = palavraInversa + palavra.valueOf(vetorCaracter[i]);
		}
		return palavraInversa;
	}
	
	public boolean palindrome(String palavra){
		int i = 0;
		int j = palavra.length() - 1;
		boolean condicao = false;
		for(;i < palavra.length();i++,j--){
			if(palavra.charAt(i) == palavra.charAt(j)){
				condicao = true;
			}else{
				break;
			}
		}
		return condicao;
	}
	
	
}
