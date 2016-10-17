package ExercicioDois;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		FixedLengthStack pilhaEstatica = new FixedLengthStack(5);
		DynamicStack pilhaDinamica = new DynamicStack(10);
		
		/* Fazendo a inserção na pilha estática.
		 * isFull() retorna true se estiver cheia, então colocamos
		 * '!' na frente para especificar que queremos inserir até diferente de true
		 */
		for(int i=0; i<5; i++){
			System.out.println("Digite o char: ");
			char a = input.nextLine().charAt(0);
			pilhaEstatica.push(a);
		}
		
		/* Retirando elementos da pilha estática */
		for(int i=0; i<2; i++){
			char retirado = pilhaEstatica.pop();
			System.out.println("Char retirado: "+retirado);
		}
		
		System.out.println("");
		/* Fazendo inserção na pilha dinâmica
		 * Nota-se que inicialmente temos 10 casas na pilha, mas vamos
		 * inserir 12 pois ela é uma pilha dinâmica
		 */
		for(int i=0; i < 12; i++){
			System.out.println("Digite o char: ");
			char a = input.nextLine().charAt(0);
			pilhaDinamica.push(a);
		}
		
		/* Retirando elementos da pilha dinâmica */
		for(int i=0; i < 2; i++){
			char retirado = pilhaDinamica.pop();
			System.out.println("\nChar retirado: "+retirado);
		}

	}

}
