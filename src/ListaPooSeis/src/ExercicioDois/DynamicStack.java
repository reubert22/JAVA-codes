package ExercicioDois;

public class DynamicStack implements ISimpleStack {

	private char[] data; // Esse array contém a pilha
	private char[] doubleData; // array temporario com o dobro de tamanho de data
	private int tos = 0; // Indice do topo

	public DynamicStack(int sizeOf) {
		data = new char[sizeOf];
		data = new char[sizeOf * 2];
		
	}

	@Override
	public void push(char ch) {
		if (tos == data.length) {
			for (int i = 0; i < tos; i++) {
				doubleData[i] = data[i];
			}
			data = doubleData;
		}
		data[tos] = ch;
		tos = tos + 1;

	}

	@Override
	public char pop() {
		if (!isEmpty()) {
			System.out.println("Erro! -A pilha está vazia, não é possivel retirar.");
		}
		tos = tos - 1;
		return data[tos];
	}

	@Override
	public boolean isEmpty() {
		if (data.length == 0 ) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		return false;
	}

}
