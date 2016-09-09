package exercicioUm.acima;

public class B {
	public static void main(String[] args){
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}
/**
 * Resposta:
 * b) Como podemos ver somente as chamadas da linha 7 e 8 (obj.y, obj.z) respectivamente são válidas,
 *    pois a propriedade y é publica, ficando visivel e z também pois ela pertence ao mesmo pacote e não tem estado de visibilidade.
 *    Não é válido acessar X pois ele é privadao, então só poderemos acessa-lo quando tivermos getters and setters (métodos de acesso)
 * 
 */
