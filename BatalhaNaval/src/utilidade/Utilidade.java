package utilidade;
import java.util.Random;
import java.util.Scanner;

public class Utilidade {
	protected static final Scanner scanner = new Scanner(System.in);
	protected static final Random random = new Random();
	
	public static Scanner obterScanner(){
		return scanner;
	}
	
	public static Random obterRandom(){
		return random;
	}
}
