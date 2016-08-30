package src;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Reubert
 */
/**
 * Faça um algoritmo que calcule o que deve ser pago por um produto,
 * considerando o preço normal de etiqueta e a escolha da condição de pagamento.
 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento
 * escolhida e efetuar o cálculo adequado.
 */
public class DescontoProduto {

    public static void main(String[] args) {
        int codigo;
        double valor_final = 0, aux, preco_produto;

        preco_produto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto: "));
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Código:\n[1] À vista em dinheiro,recebe 10% de desconto.\n[2] À vista no cartão de crédito, recebe 5% de desconto.\n[3] Em 2 vezes, preço normal de etiqueta sem juros.\n[4] Em 3 vezes, preço normal de etiqueta mais 10% de juros.\nEscolha o código: "));

        switch (codigo) {
            case 1:
                aux = 0.1 * preco_produto;
                valor_final = preco_produto - aux;
                JOptionPane.showMessageDialog(null, "À vista em dinheiro.\nPreço a pagar é: " + valor_final);
                break;
            case 2:
                aux = 0.05 * preco_produto;
                valor_final = preco_produto - aux;
                JOptionPane.showMessageDialog(null, "À vista no cartão de crédito.\nPreço a pagar é: " + valor_final);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Dividido de 2 vezes sem juros.\nPreço a pagar é: " + preco_produto);
                break;
            case 4:
                aux = 0.1 * preco_produto;
                valor_final = preco_produto + aux;
                JOptionPane.showMessageDialog(null, "Dividido de 3 vezes com 10% de juros.\nPreço a pagar é: " + valor_final);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Internal error. .:404:.");
        }

    }
}
