
import java.util.Scanner;
/******************
 * @author Reubert
 *****************/

/*******************************************************
* Este programa nos retorna todos os numeros primos
* ente os números previamente digitados, ou seja, 
* se digitarmos 7 e depois 12, ele nos retornará 7 e 11
* pois entre 7 e 12, existem somente 2 numeros primos:
* 7 e 11
*******************************************************/
public class NumerosPrimos {

    public static void main(String[] args) {
        int a, b, aux;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        a = ler.nextInt();
        System.out.print("Digite um numero: ");
        b = ler.nextInt();
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Primos: ");
        for (int i = a; i <= b; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean ehPrimo(int x) {
        boolean teste = false;
        int cont = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                cont++;
                break;
            }
        }
        if (cont == 0) {

            teste = true;
        }
        return teste;
    }

}
