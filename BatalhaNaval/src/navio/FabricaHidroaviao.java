package navio;

public class FabricaHidroaviao implements Fabrica {
	public Embarcacao criarEmbarcacao(){
		return new Hidroaviao();
	}
}
