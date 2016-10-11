package ExercicioUm;

public class Produtos {
	private int codigo;
	private String descricao;
	private double precoCompra;
	private double percentualLucro;
	
	
	public Produtos(int codigo, String descricao, double precoCompra, double percentualLucro){
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCompra = precoCompra;
		this.percentualLucro = percentualLucro;
	}
	
	public Produtos(){
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public double getPercentualLucro() {
		return percentualLucro;
	}

	public void setPercentualLucro(double percentualLucro) {
		this.percentualLucro = percentualLucro;
	}
	
}
