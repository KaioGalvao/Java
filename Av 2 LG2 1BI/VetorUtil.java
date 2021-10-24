public class VetorUtil {
    
    public static int numeroRepetido(int[] valores, int valorPesquisado){
        int contador = 0;
        
        for(int valor : valores ){
            if(valor == valorPesquisado){
                contador++;
            }
        }

        return contador;
    }

    
    public static int[] somaVetores(int[] vetor1, int[] vetor2){
        int[] novoVetor = new int[vetor1.length];
        if(vetor1.length == vetor2.length){
            for(int i = 0; i < vetor1.length; ++i){
                novoVetor[i] = vetor1[i] + vetor2[i];
            }
    
            return novoVetor;
        }
        else throw new RuntimeException("Os vetores precisam ter o mesmo tamanho para ser somado");
    }

    public static int[] vetorInvertido(int[] valores){
        int[] novoVetor = new int[valores.length];

        for(int i = 0; i < valores.length; ++i){
            novoVetor[i] = valores[valores.length - 1 - i];
        }

        return novoVetor;
    }  
    
    public static void imprimirVetor(int[] vetor){
        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
