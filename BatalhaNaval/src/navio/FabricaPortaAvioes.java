package navio;

public class FabricaPortaAvioes implements Fabrica {
	public PortaAvioes criarEmbarcacao(){
		return new PortaAvioes();
	}
}
