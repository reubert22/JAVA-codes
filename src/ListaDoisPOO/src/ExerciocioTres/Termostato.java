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
public class Termostato {
    
    private int temperatura;
    
    public Termostato(){
        temperatura = 20;
    }
    
    public int getTemperatura(){
        return temperatura;
    }
    
    public void setTemperatura(int temp){
        temperatura = temp;
    }
}
