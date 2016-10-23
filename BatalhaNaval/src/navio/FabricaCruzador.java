package navio;

public class FabricaCruzador implements Fabrica {
	public Embarcacao criarEmbarcacao(){
		return new Cruzador();
	}
}
