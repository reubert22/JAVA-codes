package navio;

public class FabricaPortaAvioes implements Fabrica {
	public Embarcacao criarEmbarcacao(){
		return new PortaAvioes();
	}
}
