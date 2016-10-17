package ExercicioUm;

public class ContaPoupanca extends Conta{
	
	private double rendimentos;

	public ContaPoupanca(int cAgencia, int cNumero, double cSaldo, double rendimentos){
		super(cAgencia,cNumero,cSaldo);
		this.rendimentos = rendimentos;
	}
	
	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	@Override
	public double getSaldoTotal(){
		return rendimentos + getSaldo();
	}
}
