package exemplo;

import java.util.Scanner;

public class PassagemValorReferencia {

	public static void main(String[] args) {
		
		int v[] = lerArray();
		String message = "Valores do array original:\n";
		for (int i = 0; i < v.length; i++) {
			message += v[i] + " ";
		}
		message += "\n";
		modificaArray(v);
		message += "Valores do array modificado:\n";
		for (int i = 0; i < v.length; i++) {
			message += v[i] + " ";
		}
		message += "\n";
		System.out.print(message);
		message = "Antes: Valor do elemento v[2]: ";
		message += v[2] + "\n";
		modificaElemento(v[2]);
		message += "Depois: Valor do elemento v[2]: ";
		message += v[2] + "\n";
		System.out.print(message);

	}

	public static void modificaArray(int vetor[]) {

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] *= 2;
		}
	}

	public static void modificaElemento(int elemento) {
		elemento *= 2;
	}

	public static int[] lerArray() {
		Scanner ler = new Scanner(System.in);
		final int n = 5;
		int v[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Elemento: ");
			v[i] = (ler.nextInt());
		}
		return v;
	}
}
