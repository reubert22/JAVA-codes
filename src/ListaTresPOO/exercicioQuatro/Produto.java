
public class Produto {
	
	private String nome;
	private double preco;
	private Etiqueta etiqueta;
	
	public Produto(String nome, double preco, Etiqueta etiqueta) {
		this.nome = nome;
		this.preco = preco;
		this.etiqueta = etiqueta;
	}

	public Produto(String nome, double preco, String marca, String tamanho) {
		etiqueta = new Etiqueta(marca,tamanho);
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
	
}
