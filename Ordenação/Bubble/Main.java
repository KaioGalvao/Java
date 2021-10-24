public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1};
        int[] numerosOrdenados = bubbleSort(numeros);

        imprimirVetor(numeros);
        imprimirVetor(numerosOrdenados);
    }


    // Isolar o método bubbleSort em uma classe Ordenacao 
    public static int[] bubbleSort(int[] vetor) {
        vetor = copiar(vetor);

        int aux;
        
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        return vetor;
    }

        // Pesquisar e implementar na classe Ordenacao o algoritmo Insertion Sort


        // Isolar os métodos copiar e imprimirVetor em uma classe VetorUtil
    public static int[] copiar(int[] vetor) {
        int[] novoVetor = new int[vetor.length];
        for(int i = 0; i < novoVetor.length; i++) {
            novoVetor[i] = vetor[i];
        }
        return novoVetor;
    }
    
    public static void imprimirVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("------------------");
    }
}    