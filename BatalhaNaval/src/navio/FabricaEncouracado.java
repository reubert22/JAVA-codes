package navio;

public class FabricaEncouracado implements Fabrica {
	public Embarcacao criarEmbarcacao(){
		return new Encouracado();
	}
}
