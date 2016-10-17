package ExercicioTres;

public class BasePlusComissionEmployee extends ComissionEmployee {

	private double salarioBase;

	public BasePlusComissionEmployee(String primeiroNome, String ultimoNome, double vendasBrutasSemanais,
			double taxaDeComissao, double salarioBase) {
		super(primeiroNome, ultimoNome, vendasBrutasSemanais, taxaDeComissao);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String toString(){
		return "\nEmpregado assalariado/comissionados: "+super.toString();
	}
	
	@Override
	public double calcularPagamento() {
		return (getTaxaDeComissao() * getVendasBrutas()) + getSalarioBase();
	}
}
