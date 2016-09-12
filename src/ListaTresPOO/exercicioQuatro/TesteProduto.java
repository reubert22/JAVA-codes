import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		/**
		 * Definindo primeiro produto
		 */
		System.out.print("Digite o preço do 1° produto: ");
		double pPreco = Double.parseDouble(ler.nextLine());
		System.out.print("Digite o nome do 1° produto: ");
		String pNome = ler.nextLine();
		System.out.print("Digite a marca do 1° produto: ");
		String pMarca = ler.nextLine();
		System.out.print("Digite o tamanho do 1° produto: ");
		String pTamanho = ler.nextLine();
		
		Produto produto1 = new Produto(pNome,pPreco,pMarca,pTamanho);
		
		/**
		 * Definindo segundo produto
		 */
		System.out.print("Digite o preço do 2° produto: ");
		double sPreco = Double.parseDouble(ler.nextLine());
		System.out.print("Digite o nome do 2° produto: ");
		String sNome = ler.nextLine();
		System.out.print("Digite a marca do 2° produto: ");
		String sMarca = ler.nextLine();
		System.out.print("Digite o tamanho do 2° produto: ");
		String sTamanho = ler.nextLine();
		
		Produto produto2 = new Produto(sNome,sPreco, new Etiqueta(sMarca,sTamanho));
		
		/**
		 * Imprimindo o que já foi definido
		 */
		System.out.println("---------------\nPrimeiro produto \nNome: "+produto1.getNome()+"\nPreço: R$"+produto1.getPreco()+"\nMarca: "+produto1.getEtiqueta().getMarca()+"\nTamanho: "+produto1.getEtiqueta().getTamanho());
		System.out.println("---------------\nSegundo produto: \nNome: "+produto2.getNome()+"\nPreço: R$"+produto2.getPreco()+"\nMarca: "+produto2.getEtiqueta().getMarca()+"\nTamanho: "+produto2.getEtiqueta().getTamanho());
		
		/**
		 * Editando / imprimindo o editado
		 */
		produto2.setNome("59 fifty");
		produto2.setPreco(89);
		produto2.setEtiqueta(new Etiqueta("New era","unico"));
		
		System.out.println("---------------\nSegundo produto EDITADO: \nNome: "+produto2.getNome()+"\nPreço: R$"+produto2.getPreco()+"\nMarca: "+produto2.getEtiqueta().getMarca()+"\nTamanho: "+produto2.getEtiqueta().getTamanho());
		
		ler.close();
	}

}
