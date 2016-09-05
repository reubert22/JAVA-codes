package terceiro;

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
