package exercicioUm;

public class TesteEstatistica {

	public static void main(String[] args) {
		
		double[] valores = {10.1, 10.2, 12, 13.5, 40.3};
		
		String mensagem = "Valores do vetor real: ";
		for(int i=0; i<valores.length; i++){
			mensagem += valores[i]+ " ";
		}
		
		mensagem += "\nMedia dos valores: "+Estatistica.media(valores);
		mensagem += "\nMaximo dos valores: "+Estatistica.maximo(valores);
		mensagem += "\nMinimo dos valores: "+Estatistica.minimo(valores);
		
		System.out.println(mensagem);
		
	}

}
