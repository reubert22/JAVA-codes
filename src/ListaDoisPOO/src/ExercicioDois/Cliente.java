/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioDois;

/**
 *
 * @author reubert
 */
public class Cliente {
    
	private String nome;
	private String cpf;
	private ContaCorrente contaCorrente;

	public Cliente(String nome, String cpf, ContaCorrente conta_corrente) {
		this.nome = nome;
		this.cpf = cpf;
		this.contaCorrente = conta_corrente;
	}
        
        public String getNome() {
		return nome;
	}
        
	public void setNome(String nome) {
		this.nome = nome;
	}
        
        public String getCpf() {
		return cpf;
	}
        
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}
