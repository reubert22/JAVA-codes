package ExercicioTres;

public class SalariedEmployee extends Employee {

	private double salarioSemanal;

	public SalariedEmployee(String nome, String sobrenome, double salarioSemanal) {
		super(nome, sobrenome);
		this.salarioSemanal = salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public String toString() {
		return "\nEmpregado assalariado: \n" + super.toString() + "\nSalario Semanal: " + salarioSemanal;
	}

	@Override
	public double calcularPagamento() {
		return salarioSemanal;
	}
}
