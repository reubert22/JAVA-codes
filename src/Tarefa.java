
import java.util.Scanner;

public class Tarefa {

    public static boolean sePrimo(int a,int b) {
        if (a <= 1) {
            return false;
        }
        if (a == 2) {
            return true;
        }
        for (int x = 2; x < a; x++) {
            if (a % x == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        int x = ler.nextInt();
        System.out.println("Digite outro numero");
        int y = ler.nextInt();
        System.out.println(sePrimo(x,y));
        
    }
}
