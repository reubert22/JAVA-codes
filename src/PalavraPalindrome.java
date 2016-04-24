
import java.util.Scanner;
/******************
 * @author Reubert
 *****************/

/************************************************
* Este programa nos retorna se a palavra digitada
* é palíndrome ou não, ou seja, se ela é a mesma
* palavra escrita de traz para frente
************************************************/

public class PalavraPalindrome {
    /*********************************************************
    *Como é notável, esta função nos retorna a palavra inversa
    **********************************************************/
    public static String inverter(String a) {
        a = a.toLowerCase();
        String b = "";
        for (int i = (a.length()) - 1; i >= 0; i--) {
            b += String.valueOf(a.charAt(i));
        }
        return (b);
    }
    
    public static boolean palin(String a) {
        if (a.equalsIgnoreCase(inverter(a))) {
            return true;
        }
        return false;
    }
    /***********************************************************
    *Aqui fazemos a leitura e imprimimos, se é palindrome ou não
    ***********************************************************/
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String x = ler.nextLine();
        System.out.println(inverter(x));
        
        if (palin(x) == true) {
            System.out.println("Palíndrome");
        } else {
            System.out.println("Não é palíndrome");
        }
    }
}
