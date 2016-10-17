package ExercicioUm;

public class Aplicacao {
	public static void main(String[] args) {
		
		ContaCorrente cC1 = new ContaCorrente(001, 1212, 100, 200);
		ContaCorrente cC2 = new ContaCorrente(002, 1213, 1000, 5000);
		
		ContaPoupanca cP1 = new ContaPoupanca(001, 2121, 1250, 10);
		ContaPoupanca cP2 = new ContaPoupanca(002, 3030, 10000, 100);
		
		System.out.println("Conta Corrente\nAgência <"+cC1.getAgencia()+">\nNumero <" +
						   +cC1.getNumero()+">\nSaldo <"+cC1.getSaldo()+">\nLimite <"+cC1.getLimite()+">\nSaldo Total <R$"+cC1.getSaldoTotal()+">");
		System.out.println("Conta Corrente\nAgência <"+cC2.getAgencia()+">\nNumero <" +
						   +cC2.getNumero()+">\nSaldo <"+cC2.getSaldo()+">\nLimite <"+cC2.getLimite()+">\nSaldo Total <R$"+cC2.getSaldoTotal()+">");
		
		System.out.println("Conta Poupança\nAgência <"+cP1.getAgencia()+">\nNumero <" +
				   +cP1.getNumero()+">\nSaldo <"+cP1.getSaldo()+">\nRendimento <"+cP1.getRendimentos()+">\nSaldo Total <R$"+cP1.getSaldoTotal()+">");
		System.out.println("Conta Poupança\nAgência <"+cP2.getAgencia()+">\nNumero <" +
				   +cP2.getNumero()+">\nSaldo <"+cP2.getSaldo()+">\nRendimento <"+cP2.getRendimentos()+">\nSaldo Total <R$"+cP2.getSaldoTotal()+">");
		
		
		/**
		 * Não podemos instanciar uma classe abstrata
		 * Podemos apenas criar referências.
		 * Serve então para o polimorfismo e a herança de atributos e métodos, como neste caso.
		 */
		
	}

}
