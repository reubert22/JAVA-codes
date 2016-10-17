package ExercicioTres;

public class HourlyEmployee extends Employee {

	private double salarioPorHora;
	private double horasTrabalhadas;

	public HourlyEmployee(String primeiroNome, String ultimoNome, double salarioPorHora, double horasTrabalhadas) {
		super(primeiroNome, ultimoNome);
		this.salarioPorHora = salarioPorHora;
		setHorasTrabalhadas(horasTrabalhadas);
	}

	public double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		if(horasTrabalhadas > 0 && horasTrabalhadas < 168){
			this.horasTrabalhadas = horasTrabalhadas;
		}
	}

	public String toString() {
		return "\nEmpregado Horista: \n" + super.toString() + "\nSalario por hora: " + getSalarioPorHora()
				+ "\nHoras trabalhadas: " + getHorasTrabalhadas();
	}

	@Override
	public double calcularPagamento() {
		if (horasTrabalhadas <= 40) {
			return salarioPorHora * horasTrabalhadas;
		}
		return 40 * salarioPorHora + (horasTrabalhadas - 40) * salarioPorHora * 1.5;
	}
}
