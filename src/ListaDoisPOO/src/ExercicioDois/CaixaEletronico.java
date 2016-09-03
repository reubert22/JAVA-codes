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
public class CaixaEletronico {

	public static void main(String[] args) {
            
                Agencia agencia = new Agencia("Bradesco", 7890, 5);
                ContaCorrente conta = new ContaCorrente(1234,4,agencia,150.00);
		Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);
		
                System.out.println(cliente.getContaCorrente().consultaSaldo());
                
                if(!cliente.getContaCorrente().saque(140.00)){
                    System.out.println("::.Não foi possivel sacar o valor desejado.::\n");
                }
                System.out.println(cliente.getContaCorrente().consultaSaldo());
                
		if(!cliente.getContaCorrente().saque(200.00)){
                    System.out.println("::.Não foi possivel sacar o valor desejado.::\n");
                }
		System.out.println(cliente.getContaCorrente().consultaSaldo());
                
                cliente.getContaCorrente().deposito(25.45);
                System.out.println(cliente.getContaCorrente().consultaSaldo());
		
	}
}
