import java.util.Scanner;
/******************
 * @author Reubert
 *****************/

/****************************************************************
* Este programa nos retorna a palavra/frase digitada sem espaços,
* melhor falando, ele nos retorna uma frase sem espaços
* tudo junto, exemplo: reubert barbosa
*                      reubertbarbosa
****************************************************************/
public class TirandoEspacos {

    public static String nome(String a) {
        String ac = "";
        String aux = "";
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
            } else {
                ac+=a.charAt(i);
            }

        }
        return ac;

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite: ");
        String x = ler.nextLine();
        System.out.println(nome(x));
    }

}
