/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioQuatro;

import java.util.Scanner;

/**
 *
 * @author reubert
 */
public class Dna {

    private char sequencia[] = new char[9];

    public Dna() {
        lerDna();
    }

    public void lerDna() {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite a base[" + i + "]: ");
            sequencia[i] = ler.nextLine().charAt(0); //lê a primeira letra digitada
        }
        //ler.close();
    }

    public char[] getSequencia() {
        return sequencia;
    }

    public void setSequencia(char[] sequencia) {
        this.sequencia = sequencia;
    }

    public String toString() {
        String sequenciaDna = ""; //incializamos a string
        for (int i = 0; i < 9; i++) {
            sequenciaDna = sequenciaDna + sequencia[i]; // recebe cada caractere do dna
        }
        return sequenciaDna;
    }

    public int obterFrequencia(char caractere) {
        int contadorFrequencia = 0;
        for (int i = 0; i < 9; i++) {
            if (sequencia[i] == caractere) {
                contadorFrequencia += 1;
            }
        }
        return contadorFrequencia;
    }

    public int verificarSimilaridade(Dna dna) {
        int contadorSimilaridade = 0;
        char[] pegaSequencia = dna.getSequencia();
        for (int i = 0; i < 9; i++) {
            //se houver similaridade entre as bases
            if (pegaSequencia[i] == sequencia[i]) {
                //contamos mais um
                contadorSimilaridade += 1;
            }
        }
        //retornamos então a quantidade
        return contadorSimilaridade;
    }
}
