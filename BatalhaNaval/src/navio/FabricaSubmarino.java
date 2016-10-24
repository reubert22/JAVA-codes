package navio;

public class FabricaSubmarino implements Fabrica {
	
	public Submarino criarEmbarcacao(){
		return new Submarino();
	}
}
