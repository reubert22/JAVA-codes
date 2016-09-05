package terceiro;

/**
 *
 * @author reubert
 */
public class Usuario {
    public static void main(String[] args) {
        
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        int temperatura;
        
        condicionador.ligar();
        /**
         * Laços de repetição para aumentar e diminuir a temperatura
         * sabendo que nosso ar condicionado já está com 20°
         * pedimos para aumentar para 30°, depois reduzair para 10°
         * e por final aumentar para 25°
         */
        for(int i=0; i < 10; i++){
            //aumentando para 30°
            condicionador.aumentaTemperatura();
        }
        for(int i=0; i < 18; i++){
            //diminuindo para 10°
            condicionador.diminuiTemperatura();
        }
        for(int i=0; i < 10; i++){
            //aumentando para 25°
            condicionador.aumentaTemperatura();
        }
        
        temperatura = condicionador.getTermostato().getTemperatura();
        System.out.println("\nTemperatura atual: "+temperatura+"°");
    }
}
