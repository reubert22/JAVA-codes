package ExercicioTres;

public abstract class Employee {
	private String primeiroNome;
	private String ultimoNome;

	public Employee(String primeiroNome, String ultimoNome) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public abstract double calcularPagamento();

	public String toString() {
		return primeiroNome + " " + ultimoNome;
	}
}
