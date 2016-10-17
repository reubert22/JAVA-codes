package ExercicioDois;

public class FixedLengthStack implements ISimpleStack{
	
	private char[] data; //Esse array contém a pilha
	private int tos;     //Indice do topo da pilha
	
	public FixedLengthStack(int sizeOf){
		data = new char[sizeOf];
		tos = 0;
	}

	@Override
	public void push(char ch) {
		if(isFull()){
			System.out.print("Erro! -Pilha está cheia, não é possivel inserir.");
		}
		data[tos] = ch;
		tos = tos + 1;
	}

	@Override
	public char pop() {
		if(!isEmpty()){
			System.out.print("Erro! -Pilha está vazia, não é possivel retirar.");
		}
		tos = tos - 1;
		return data[tos];
	}

	@Override
	public boolean isEmpty() {
		if(data.length == 0){
			return true;
		}
		return true;
	}

	@Override
	public boolean isFull() {
		if(tos == data.length){
			return true;
		}
		return false;
	}
	
}
