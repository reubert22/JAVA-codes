package exercicioTres;

public class Classe2 {

	/**
	 * Primeiramente são instanciados dois obj da classe1;
	 * Então passamos o valor 10 para x do obj1, e sucessivamente 20 para x de obj2
	 * Fazemos a impressão com os valores de x do obj1 e obj2 respectivamente
	 * Na classe1 temos dois atributos: x e y (sendo y estático)
	 * passamos para y da classe1 o valor 19, mas como ele é estático, os dois objetos criados vão receber o mesmo
	 * valor
	 * Após isso fazemos a impressão de x do obj1 e obj2 passando pelo método de soma.
	 * o método de soma x com y que é uma propriedade da classe e não dos objetos criados
	 * se x em obj1 tinha 10, somamos com 19 de y e temos 29
	 * o mesmo ocorre com o obj2 e dai temos 39
	 */
	public static void main(String[] args) {

		Classe1 obj1 = new Classe1();
		Classe1 obj2 = new Classe1();
		obj1.x = 10;
		obj2.x = 20;
		System.out.println("obj1.x: " + obj1.x);
		System.out.println("obj2.x: " + obj2.x);
		Classe1.y = 19;
		System.out.println("obj1.x: " + obj1.somar());
		System.out.println("obj2.x: " + obj2.somar());

	}

}
