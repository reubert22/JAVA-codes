package ExerciocioTres;

/**
 *
 * @author reubert
 */
public class CondicionadorDeAr {
    
    private Termostato termostato;
    private boolean ligado;
    
    public CondicionadorDeAr(){
        termostato = new Termostato();
        ligado = false;
    }
    
    //métodos de acesso
    public boolean getLigado(){
        return ligado;
    }
    
    public Termostato getTermostato(){
        return termostato;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligado(){
        ligado = false;
    }
    
    public boolean aumentaTemperatura(int quantidade){
        if(termostato.getTemperatura() >= 28 || ligado == false || quantidade >= 28){
            System.out.println("Não foi possivel aumentar a temperatura");
            return false;
        }
        termostato.setTemperatura(quantidade);
        return true;
    }
    
    public boolean diminuiTemperatura(int quantidade){
        if(termostato.getTemperatura() <= 15 || ligado == false || quantidade <= 15){
            System.out.println("Não foi possivel diminuir a temperatura");
            return false;
        }
        termostato.setTemperatura(quantidade);
        return true;
    }
}
