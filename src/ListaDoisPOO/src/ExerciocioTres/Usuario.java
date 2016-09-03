/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciocioTres;

/**
 *
 * @author reubert
 */
public class Usuario {
    public static void main(String[] args) {
        
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        int temperatura;
        
        condicionador.getTermostato().setTemperatura(30);
        condicionador.getTermostato().setTemperatura(10);
        condicionador.getTermostato().setTemperatura(25);
        temperatura = condicionador.getTermostato().getTemperatura();
        
        System.out.println("Temperatura atual: "+temperatura+"°");
    }
}
