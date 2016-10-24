package navio;

public class FabricaHidroaviao implements Fabrica {
	
	public Hidroaviao criarEmbarcacao(){
		return new Hidroaviao();
	}
}
