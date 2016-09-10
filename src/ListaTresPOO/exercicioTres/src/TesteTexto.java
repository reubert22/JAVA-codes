package src;

public class TesteTexto {

	public static void main(String[] args) {
		
		Texto texto = new Texto();
		String primPalavra = "Reubert";
		String segPalavra  = "Fabia";
		String verbo = "Pedalar";
		
		int quantPPalavra = texto.contarVogais(primPalavra);
		int quantSPalavra = texto.contarVogais(segPalavra);
		
		System.out.println("Quantidade vogais (Reubert): "+quantPPalavra+"\nQuantidade vogais (Fabia): "+quantSPalavra);
		System.out.println(texto.conjugarVerbo(verbo));
		System.out.println("Reubert inverso: "+texto.obterInverso(primPalavra));
		
		
		System.out.println(texto.palindrome("Natan"));
		
	}

}
