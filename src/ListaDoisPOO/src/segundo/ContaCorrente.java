/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundo;

/**
 *
 * @author reubert
 */
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
	
        public int getNumero(){
		return numero;
	}
        
	public void setNumero(int numero){
		this.numero = numero;
	}
	
	public int getDigito(){
		return digito;
	}
	
	public void setDigito(int digito){
		this.digito = digito;
	}
	
	public Agencia getAgencia(){
		return agencia;
	}
	
	public void setAgencia(Agencia agencia){
		this.agencia = agencia;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
        
	public boolean deposito(double deposito){
		if(deposito <= 0){
                    return false;
		}
                saldo += deposito;
                return true;
	}
	
	public boolean saque(double saque){
		if(saque > saldo || saque <= 0){
                    return false;
		}
                saldo -= saque;
		return true;
	}
	
	public String consultaSaldo(){
		return "Agência: "+agencia.getNumero()+"-"+agencia.getDigito()+"\nConta: "+numero+"-"+digito+"\nSaldo: R$"+saldo+"\n";
	}
	
}
