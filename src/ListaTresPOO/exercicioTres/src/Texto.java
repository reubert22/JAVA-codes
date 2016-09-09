package src;

public class Texto {
	
	public int contarVogais(String palavra){
		int contVogais = 0;
		String vogaisMin = "aeiou";
		String vogaisMai = "AEIOU";
		for(int i=0; i<palavra.length();i++){
			for(int j=0; j<vogaisMin.length(); j++){
				if(palavra.charAt(i) == vogaisMin.charAt(j) || palavra.charAt(i) == vogaisMai.charAt(j)){
					contVogais += 1;
				}
			}
		}
		return contVogais;
	}
	
	public String conjugarVerbo(String verbo){
		//to do
	}
}
