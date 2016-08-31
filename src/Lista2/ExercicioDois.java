/*Corrigir código, não compila*/
==============================================================
public class Cliente {
	private String nome;
	private String cpf;
	private ContaCorrente conta_corrente;

	public Cliente(String nome, String cpf, ContaCorrente conta_corrente) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta_corrente = conta_corrente;
	}
	
	public Cliente(){
		
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setContaCorrente(ContaCorrente conta_corrente) {
		this.conta_corrente = conta_corrente;
	}

	public ContaCorrente getContaCorrente() {
		return conta_corrente;
	}
	
}
==============================================================
/*Corrigir código, não compila*/
public class ContaCorrente {
	private int numero;
	private int digito;
	private Agencia agencia;
	private double saldo;
	
	public ContaCorrente(int numero,int digito,Agencia agencia,double saldo){
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public ContaCorrente(){
		
	}
	
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setDigito(int digito){
		this.digito = digito;
	}
	
	public int getDigito(){
		return digito;
	}
	
	public void setAgencia(Agencia agencia){
		this.agencia = agencia;
	}
	
	public Agencia getAgencia(){
		return agencia;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void deposito(double deposito){
		if(deposito > 0){
			this.saldo += deposito;
		}
	}
	
	public boolean saque(double saque){
		if(this.saldo >= saque){
			this.saldo -= saque;
		}
		return false;
	}
	
	public String consultaSaldo(){
		return "Numero da conta: "+this.numero+"-"+this.digito+"\nSaldo: "+saldo;
	}//+agencia.toString()+
	
}
==============================================================
/*Corrigir código, não compila*/
public class Agencia {
	private String nome;
	private int numero;
	private int digito;
	
	public Agencia(String nome, int numero, int digito) {
		this.nome = nome;
		this.numero = numero;
		this.digito = digito;
	}
	
	public Agencia(){
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getDigito() {
		return digito;
	}
	
	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	public String toString(){
		return "Agência: "+numero+"\nDigito: "+digito;
	}
}
==============================================================
/*Corrigir código, não compila*/
public class CaixaEletronico {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		ContaCorrente conta = new ContaCorrente();
		Agencia agencia = new Agencia();

		cliente.setNome("Ademar Apior");
		cliente.setCpf("123231518-12");

		agencia.setNumero(7890);
		agencia.setDigito(5);

		conta.setNumero(1234);
		conta.setDigito(4);
		conta.setSaldo(150.00);

		conta.saque(140.00);
		conta.consultaSaldo();
		/*if (!*/conta.saque(200.00);/*) {*/
			//System.out.println("Saque inválido, consulte saldo.");
		//}
		conta.consultaSaldo();
		conta.deposito(25.45);
		conta.consultaSaldo();
	}
}

==============================================================
