
import java.util.Scanner;
/******************
 * @author Reubert
 *****************/

/********************************************************
* Aqui temos um programa que ordena o vetor de uma maneira
* crescente, ou seja, do menor para o maior.
********************************************************/
public class OrdenaVetor {

    public static void imprimeVetor(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
        System.out.println(" ");
    }
    /*
    * Preenchimento do vetor
    */
    public static void preencheVetor(int[] x) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.println("Digite um valor: "+(i+1)+" do vetor: ");
            x[i] = ler.nextInt();
        }
    }

    public static void ordenaVetor(int[] x) {
        int aux;
        for (int i = 0; i < (x.length - 1); i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a seguir o tamanho do vetor que desejas: ");
        int tamanho = ler.nextInt();
        int[] z = new int[tamanho];
        preencheVetor(z);
        System.out.println("\nImprimindo\n");
        System.out.println(".::Vetor anterior::.");
        imprimeVetor(z);
        ordenaVetor(z);
        System.out.println(".::Vetor Ordenado::.");
        imprimeVetor(z);
    }
}
