package quartoQuinto;

/**
 *
 * @author reubert
 */
public class TesteDna {
    public static void main(String[] args) {
        
        /**
         * Nos facilita, ao invés de entrar toda hora com todas sequências de DNAs
         * via teclado.
         */
        char[] sequencia1 = {'a','t','g','c','a','a','c','t','a'};
        char[] sequencia2 = {'g','g','c','c','a','a','t','a','t'};
        char[] sequencia3 = {'c','a','a','t','g','c','c','a','c'};
        char[] sequencia4 = {'t','t','g','c','c','c','t','t','c'};
        Dna dna1 = new Dna(sequencia1);
        Dna dna2 = new Dna(sequencia2);
        Dna dna3 = new Dna(sequencia3);
        Dna dna4 = new Dna(sequencia4);
        /*************************************************************************/
        
        /**
         * Comparações para ver qual sequência de DNA tem mais Adenina
         */
        int frequenciaA = dna1.obterFrequencia('a');
        int frequenciaB = dna2.obterFrequencia('a');
        int frequenciaC = dna3.obterFrequencia('a');
        int frequenciaD = dna4.obterFrequencia('a');
        if(frequenciaA >= frequenciaB && frequenciaA >= frequenciaC && frequenciaA >= frequenciaD){
            System.out.println("Sequência de DNA1 tem mais Adenina");
        }else if(frequenciaB >= frequenciaA && frequenciaB >= frequenciaC && frequenciaB >= frequenciaD){
            System.out.println("Sequência de DNA2 tem mais Adenina");
        }else if(frequenciaC >= frequenciaA && frequenciaC >= frequenciaB && frequenciaC >= frequenciaD){
            System.out.println("Sequência de DNA3 tem mais Adenina");
        }else if(frequenciaD >= frequenciaA && frequenciaD >= frequenciaB && frequenciaD >= frequenciaC){
            System.out.println("Sequência de DNA4 tem mais Adenina");
        }
        
        
    }
}
