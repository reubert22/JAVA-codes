package exercicioUm;

public class Estatistica {
	
	public static double media(double[] valores){
		double soma = 0;
		double media = 0;
		for(int i=0; i<valores.length; i++){
			soma += valores[i];
		}
		media = soma / valores.length;
		return media;
	}
	
	public static double maximo(double[] valores){
		double maximo = 0;
		for(int i=0; i<valores.length; i++){
			if(valores[i] >= maximo){
				maximo = valores[i];
			}
		}
		return maximo;
	}
	
	public static double minimo(double[] valores){
		double minimo = valores[1];
		for(int i=0; i<valores.length; i++){
			if(valores[i] <= minimo){
				minimo = valores[i];
			}
		}
		return minimo;
	}
	
}
