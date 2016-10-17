package ExercicioTres;

public class Test {

	public static void main(String[] args) {
		SalariedEmployee empSalariado = new SalariedEmployee("Reubert", "Barbosa", 300.00);
		ComissionEmployee empComissionado = new ComissionEmployee("Carlos", "Eduardo", 120, 1.10);
		HourlyEmployee empHorario = new HourlyEmployee("Felipe", "Fella", 30, 45);
		BasePlusComissionEmployee empAssalComissionado = new BasePlusComissionEmployee("Stanley", "Sathler", 100, 1.03,
				1200);

		System.out.println(empSalariado.toString() + " Pagamento: " + empSalariado.calcularPagamento());
		System.out.println(empComissionado.toString() + " Pagamento: " + empComissionado.calcularPagamento());
		System.out.println(empHorario.toString() + " Pagamento: " + empHorario.calcularPagamento());
		System.out.println(empAssalComissionado.toString() + " Pagamento: " + empAssalComissionado.calcularPagamento());

		empAssalComissionado.setSalarioBase(empAssalComissionado.getSalarioBase() * 1.10);
		System.out.println("-----------------------------------");
		System.out.println(empSalariado.toString() + " Pagamento: " + empSalariado.calcularPagamento());
		System.out.println(empComissionado.toString() + " Pagamento: " + empComissionado.calcularPagamento());
		System.out.println(empHorario.toString() + " Pagamento: " + empHorario.calcularPagamento());
		System.out.println(empAssalComissionado.toString() + " Pagamento: " + empAssalComissionado.calcularPagamento());
	}

}
