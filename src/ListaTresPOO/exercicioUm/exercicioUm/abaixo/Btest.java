package exercicioUm.abaixo;

import exercicioUm.acima.A;

/**
 *
 * @author reubert
 */
public class Btest {
    public static void main(String[] args){
		
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
	
}
/**
 * Resposta:
 * a) Tivemos que importar a classe A, mas mesmo assim X e Z são inválidos, pois X é privado e não temos métodos de acesso
 *    e z pois ele não é publico na classe A e não pode ser acessado fora do pacote.
 */
