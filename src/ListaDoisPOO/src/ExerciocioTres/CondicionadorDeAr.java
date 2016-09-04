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
    
    public boolean aumentaTemperatura(){
        if(termostato.getTemperatura() >= 28 || ligado == false){
            System.out.println("Não foi possivel aumentar a temperatura ou está desligado");
            return false;
        }
        termostato.setTemperatura(termostato.getTemperatura()+1);
        return true;
    }
    
    public boolean diminuiTemperatura(){
        if(termostato.getTemperatura() <= 15 || ligado == false){
            System.out.println("Não foi possivel diminuir a temperatura ou está desligado");
            return false;
        }
        termostato.setTemperatura(termostato.getTemperatura()-1);
        return true;
    }
}
