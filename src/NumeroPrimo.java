import javax.swing.JOptionPane;
/******************
 * @author Reubert
 *****************/

/************************************************
* Este programa nos retorna se a o número digitado
* através de uma janela flutuante é primou ou não
************************************************/
public class NumeroPrimo {

    public static void main(String args[]) {

        String entrada;
        int n, cont;
        entrada = JOptionPane.showInputDialog(null, "informe um numero");
        n = Integer.parseInt(entrada);
        cont = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont = cont + 1;
            }
        }

        if (cont == 2) {
            JOptionPane.showMessageDialog(null, "o numero: " + n + " é primo");
        } else {
            JOptionPane.showMessageDialog(null, "o numero: " + n + " não é primo");
        }
    }
}
