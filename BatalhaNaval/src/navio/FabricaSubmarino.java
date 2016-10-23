package navio;

public class FabricaSubmarino implements Fabrica {
	public Embarcacao criarEmbarcacao(){
		return new Submarino();
	}
}
