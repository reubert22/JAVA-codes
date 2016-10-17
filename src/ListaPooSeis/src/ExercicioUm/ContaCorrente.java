package ExercicioUm;

public class ContaCorrente extends Conta{
	
	private double limite;
	
	public ContaCorrente(int cAgencia, int cNumero, double cSaldo, double limite){
		super(cAgencia, cNumero, cSaldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public double getSaldoTotal(){
		return limite + getSaldo();
	}
}
