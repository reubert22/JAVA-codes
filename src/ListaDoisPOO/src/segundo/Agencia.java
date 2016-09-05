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
public class Agencia {
    
	private String nome;
	private int numero;
	private int digito;
	
	public Agencia(String nome, int numero, int digito) {
		this.nome = nome;
		this.numero = numero;
		this.digito = digito;
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
}
