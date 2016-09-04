package ExerciocioTres;

/**
 *
 * @author reubert
 */
public class Usuario {
    public static void main(String[] args) {
        
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        int temperatura;
        
        condicionador.ligar();
        condicionador.aumentaTemperatura(30);
        condicionador.diminuiTemperatura(10);
        condicionador.aumentaTemperatura(25);
        temperatura = condicionador.getTermostato().getTemperatura();
        
        System.out.println("Temperatura atual: "+temperatura+"°");
    }
}
