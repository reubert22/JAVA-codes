package ExercicioUm;

public class ControleFarmacia {

	public static void main(String[] args) {
		Remedio remedio1 = new Remedio(001, "XXX - Tarja Preta", 15.00, 2.00, 1.10);
		Remedio remedio2 = new Remedio(002, "Novalgina - generico", 5.00, 1, 1.10);
		
		ArtigoHigiene hig1 = new ArtigoHigiene(101, "Algodao", 2, 100);
		ArtigoHigiene hig2 = new ArtigoHigiene(102, "alcool", 7, 3.2);
		
		System.out.println("Codigo: "+remedio1.getCodigo()+" Descricao: "+remedio1.getDescricao()+" Preco: "+remedio1.gerarPrecoVenda()+
							" Percentual de Lucro: "+remedio1.getPercentualLucro());
		System.out.println("\nCodigo: "+remedio2.getCodigo()+" Descricao: "+remedio2.getDescricao()+" Preco: "+remedio2.gerarPrecoVenda()+
							"Percentual de Lucro: "+remedio2.getPercentualLucro());
		
		System.out.println("\nArtigo de Higiene: "+hig1.getCodigo()+" Descricao: "+hig1.getDescricao()+" Preco: "+hig1.gerarPrecoDeVenda()+
							" Percentual de Lucro: "+hig1.getPercentualLucro());
		System.out.println("\nArtigo de Higiene: "+hig2.getCodigo()+" Descricao: "+hig2.getDescricao()+" Preco: "+hig2.gerarPrecoDeVenda()+
							" Percentual de Lucro: "+hig2.getPercentualLucro());
		
		remedio1.setValorDesconto(0.3);
		remedio2.setValorDesconto(0.55);
		System.out.println("\nRémedio código: "+remedio1.getCodigo()+" Valor de desconto: "+remedio1.getValorDesconto()+
						   "\nRemédio código: "+remedio2.getCodigo()+" VAlor de desconto: "+remedio2.getValorDesconto());
		
		
		
	}
	// Imprimir tuuudo sobre os remedios e higiene
}
