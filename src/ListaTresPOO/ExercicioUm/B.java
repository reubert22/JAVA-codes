package ExercicioUm;

public class B {
	public static void main(String[] args){
		A obj = new A();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
	}
}
/**
 * Respostas:
 * a) 
 * b) Como podemos ver somente as chamadas da linha 7 e 8 (obj.y, obj.z) respectivamente, pois a propriedade y é publica, ficando visivel.
 * 	  z também pois ela é uma propriedade publica, por padrão
 */
