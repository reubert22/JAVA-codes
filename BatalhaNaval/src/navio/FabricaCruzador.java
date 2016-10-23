package navio;

public class FabricaCruzador implements Fabrica {
	public Cruzador criarEmbarcacao(){
		return new Cruzador();
	}
}
