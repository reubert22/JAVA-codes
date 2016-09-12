package src;

public class Escopo {
	public static void main(String[] args) {

		int i = 5;
		for (int j = 0; j < 6; j++) {
			System.out.println(j);
		}
		System.out.println(i);
		System.out.println(j);
		if (i == 5) {
			int valor = 10;
		} else {
			valor = 12;
		}
		System.out.println(valor);
	}

}

/**
 * Como podemos ver, o erro está localizado no escopo das variáveis.
 * O erro começa pela variável 'j', pois ela tem escopo local ( dentro do for ) e tentamos aqui imprimir ela fora de seu alcance (fora do seu escopo).
 * Depois temos também uma variável 'valor' sendo declarada com escopo local, e sendo retornada fora de seu alcance.
 */