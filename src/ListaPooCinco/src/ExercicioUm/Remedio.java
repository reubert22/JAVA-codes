package ExercicioUm;

public class Remedio extends Produtos{
	private double valorDesconto;
	
	public Remedio(int codigo, String descricao, double precoCompra, 
				   double percentualLucro, double valorDesconto){
		super(codigo, descricao, precoCompra, percentualLucro);
		this.valorDesconto = valorDesconto;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public double gerarPrecoVenda(){
		return (getPrecoCompra() + getPercentualLucro()) - (this.valorDesconto);
	}
}
