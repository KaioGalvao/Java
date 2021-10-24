public class VetorUtil{
    public static int[] vetorZero(int[] valores){
        int contador = 0;
        for(int i = 0; i < valores.length; ++i){
            if(valores[i] !=  0){
                contador++;
            }
        }
  
        int[] novoVetor = new int[contador];
        contador = 0;
        for(int valor : valores){
            if(valor != 0){
                novoVetor[contador] = valor;
                contador++;
            }
        }
      
        return novoVetor;
    }
  
    public static int[] posicaoVetor(int[] valores, int numero){
        int contador = 0;
      
  
        for(int i = 0; i < valores.length; ++i){
            if(valores[i] == numero){
                contador++;
            }
        }
  
        int[] novaPosicao = new int[contador];
        contador = 0;
  
        for(int i = 0; i<valores.length; ++i){
            if(valores[i] == numero){
                novaPosicao[contador] = i;
                contador++;
            }
        }
  
        return novaPosicao;
    }
  
    public static int[] intersecaoVetor(int[] vetor, int[]valores){
        int[] valorTotal = new int[vetor.length + valores.length];
        int contador = 0;
  
        for(int i = 0; i < vetor.length; ++i){
            for(int j = 0; j < valores.length; ++j){
                if(vetor[i] == valores[j]){
                    int conferir = 0;
  
                    for (int k = 0; k < valorTotal.length; ++k) {
                        if (vetor[i] == valorTotal[k]){
                            conferir = 1;
                        }
                    }
                    if (conferir == 0) {
                        valorTotal[contador] = vetor[i];
                        contador++;
                    }
                }	
            }
        }
          
        int[] intersecao = new int[contador];
          
        for (int i = 0; i < intersecao.length; ++i) {
            intersecao[i] = valorTotal[i];
        }
        return intersecao;
    }
  
}