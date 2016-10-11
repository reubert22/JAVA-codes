package ExercicioUm;

public class ArtigoHigiene extends Produtos {
	
	public ArtigoHigiene(int codigo, String descricao, double precoCompra, 
			   		 	 double percentualLucro){
		super(codigo, descricao, precoCompra, percentualLucro);
	}
	
	public double gerarPrecoDeVenda(){
		return (getPrecoCompra() * 1.30);
	}
}
