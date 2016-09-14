package exercicioDois;

public class Atleta {
	
	private int dia;
	private int mes;
	private int ano;
	private double peso;
	private double altura;
	
	public Atleta(int dia, int mes, int ano, double peso, double altura){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.peso = peso;
		this.altura = altura;
	}
	
	public double IMC(){
		return peso/(Math.pow(altura, 2));
	}
	
	public boolean acimaDoPeso(){
		final int peso = 28;
		if(IMC() < peso){
			return false; 
		}
		return true;
	}
	
	public String toString(){
		return "Nascimento: "+dia+"/"+mes+"/"+ano+"\nPeso: "+peso+"\tAltura: "+altura;
	}
}
