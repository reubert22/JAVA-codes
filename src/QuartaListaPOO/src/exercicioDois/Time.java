package exercicioDois;

import exercicioUm.Estatistica;

public class Time {
	
	private Atleta[] atleta;
	
	public Time(Atleta[] atleta){
		this.atleta = atleta;
	}
	
	public double[] getIMCAtletas(){
		double imc[] = new double[atleta.length];
		for(int i=0; i<atleta.length; i++){
			imc[i] = atleta[i].IMC();
		}
		return imc;
	}
	
	public double getMediaIMC(){
		double[] imcMedia = this.getIMCAtletas();
		return Estatistica.media(imcMedia);
	}
	
	public double getMaximoIMC(){
		double[] imcMaximo = this.getIMCAtletas();
		return Estatistica.maximo(imcMaximo);
	}
	
	public double getMinimoIMC(){
		double[] imcMinimo = this.getIMCAtletas();
		return Estatistica.minimo(imcMinimo);
	}
	
	public String toString(){
		String dados = "";
		for(int i=0; i<atleta.length; i++){
			dados += ""+atleta[i] + "\n";
		}
		return dados;
	}
	
}
