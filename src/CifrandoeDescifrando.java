import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/******************
 * @author Reubert
 *****************/

/********************************************************
* Aqui temos um programa que cifra a palavra digitada
* de acordo com a chave escolhida e salva a criptografia 
* em um arquivo .txt, podemos então decifrar essa palavra
* com a mesma chave e até mesmo conferir se é igual
* ilustrando o caso de um login
********************************************************/
public class CifrandoeDescifrando {

    public static String cifrarString(String x) {
        String j = "";
        for (int i = 0; i < x.length(); i++) {
            j += (char) (x.charAt(i) + 1);
        }
        return j;
    }

    public static String cifrarString(String x, int chave) {
        String j = "";
        for (int i = 0; i < x.length(); i++) {
            j += (char) (x.charAt(i) + chave);
        }
        return j;
    }

    public static String decifrarString(String x) {
        String j = "";
        for (int i = 0; i < x.length(); i++) {
            j += (char) (x.charAt(i) - 1);
        }
        return j;
    }

    public static String decifrarString(String x, int chave) {
        String j = "";
        for (int i = 0; i < x.length(); i++) {
            j += (char) (x.charAt(i) - chave);
        }
        return j;
    }

    public static String escreverNoArquivo(String x) {
        File dir = new File("C:\\pasta");//onde criar
        File arq = new File(dir, "cripto.txt");//em qual diretorio , e o nome entre " "
        try {
            arq.createNewFile();//criando arquivo
            FileWriter filewriter = new FileWriter(arq, false);//esse abre o arquivo. TRUE:escreve no arquivo sem apagar o arquivo anterior
            //FALSE:apaga o conteudo do arquivo e escreve
            PrintWriter printwrite = new PrintWriter(filewriter);//este escreve no arquivo
            printwrite.println(x);
            printwrite.flush();
            printwrite.close();
        } catch (Exception e) {
        }
        return x;
    }

    public static String lerDoArquivo() {
        String i = "";
        File dir = new File("C:\\pasta");
        File arq = new File(dir, "cripto.txt");
        String linha = "";
        try {
            FileReader filereader = new FileReader(arq);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            while ((linha = bufferedreader.readLine()) != null) {
                i += linha;
            }
            filereader.close();
            bufferedreader.close();
        } catch (Exception e) {
        }

        return i;
    }

    public static int pegaChave() {
        int chave = 0;
        Scanner ler = new Scanner(System.in);
        while (chave < 1 || chave > 1000) {
            System.out.println("Digite a[o valor deve ser entre 1 e 10k ]");
            chave = ler.nextInt();
        }
        return (chave % 126);
    }

    public static int menu() {
        int x = 0;
        Scanner ler = new Scanner(System.in);
        while (x < 1 || x > 4) {
            System.out.println("menu");
            System.out.println("1 - Criar e Cifrar");
            System.out.println("2 - Decifrar");
            System.out.println("3 - Comparar");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            x = ler.nextInt();

        }
        return x;
    }

    public static void comparar(String x, int chave) {
        if (x.equals(decifrarString(lerDoArquivo(), chave))) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado:");
        }
    }

    public static void main(String[] args) {
        String cifrar;
        Scanner ler = new Scanner(System.in);
        int i = 0;
        while (true) {
            i = menu();
            switch (i) {
                case 1:
                    System.out.println("Digite a palavra");
                    cifrar = ler.nextLine();
                    String x = escreverNoArquivo(cifrarString(cifrar, pegaChave()));
                    System.out.println("String cifrada: " + x);
                    break;
                case 2:
                    System.out.println("String decifrada:" + decifrarString(lerDoArquivo(), pegaChave()));
                    break;
                case 3:
                    System.out.println("Digite a string: ");
                    cifrar = ler.nextLine();
                    comparar(cifrar, pegaChave());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
