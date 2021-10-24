public class Main{
    public static void main(String[] args) {
        //Declaração de variáveis Primeiro método
        int[] valores = {1, 20, 30, 1, 5, 30, 1, 5};
        int numeroPesquisado = 1;
        
        System.out.println("Metodo 1:");
        System.out.println(VetorUtil.numeroRepetido(valores, numeroPesquisado));

        //Declaração de variáveis Segundo método
        int[] vetor1 = {1, 2, 4, 6, 10};
        int[] vetor2 = {6, 8, 2, 10, 10};
        int[] novoVetor = new int[vetor1.length];
        novoVetor = VetorUtil.somaVetores(vetor1, vetor2);

        System.out.println("\nMetodo 2:");
        VetorUtil.imprimirVetor(novoVetor);

        
        //Declaração de variáveis Terceiro método
        int[] vetor4 = {1, 4, 2, 5, 9};
        int[] vetorInvertido = new int[vetor4.length];
        vetorInvertido = VetorUtil.vetorInvertido(vetor4);

        System.out.println("\nMetodo 3:");
        VetorUtil.imprimirVetor(vetorInvertido);
    }
}