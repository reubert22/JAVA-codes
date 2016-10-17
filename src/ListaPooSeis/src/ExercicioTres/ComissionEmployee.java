package ExercicioTres;

public class ComissionEmployee extends Employee {

	private double vendasBrutas;
	private double taxaDeComissao;

	public ComissionEmployee(String primeiroNome, String ultimoNome, double vendasBrutas, double taxaDeComissao) {
		super(primeiroNome, ultimoNome);
		this.vendasBrutas = vendasBrutas;
		this.taxaDeComissao = taxaDeComissao;
	}

	public double getVendasBrutas() {
		return vendasBrutas;
	}

	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}

	public double getTaxaDeComissao() {
		return taxaDeComissao;
	}

	public void setTaxaDeComissao(double taxaDeComissao) {
		this.taxaDeComissao = taxaDeComissao;
	}

	public String toString() {
		return "\nEmpregado Comissionado: " + super.toString() + "\nVenda total: " + getVendasBrutas()
				+ "\nTaxa de comissao: " + getTaxaDeComissao();
	}

	@Override
	public double calcularPagamento() {
		return taxaDeComissao * vendasBrutas;
	}
}
