package exercicioDois;

import java.util.Scanner;

public class TesteAtleta {
	public static void main(String[] args) {
		
		//Colocado como estático os atributos para não ficar digitando a cada compilação
		Atleta atleta1 = new Atleta(5,6,1992,70.2,1.7);
		Atleta atleta2 = new Atleta(5,7,1993,70.3,1.8);
		Atleta atleta3 = new Atleta(5,8,1994,70,1.9);
		Atleta atleta4 = new Atleta(5,9,1995,70,1.50);
		Atleta atleta5 = new Atleta(5,10,1996,70,1.60);
		
		
		Atleta[] at = {atleta1, atleta2, atleta3, atleta4, atleta5};
		
		Time todoTime = new Time(at);
		
		System.out.println(todoTime);
	}

}
