public class Main {
    public static void main(String[] args) {
      
      int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1, 20, 74, 22, 0};
      int[] numerosOrdenados = Ordenacao.bubbleSort(numeros);
      int[] numerosOrnenadosInsertionSort = Ordenacao.insertionSort(numeros);
      
      System.out.println("\nNUMEROS");
      VetorUtil.imprimirVetor(numeros);
      
      System.out.println("\nBUBBLE SORT");
      VetorUtil.imprimirVetor(numerosOrdenados);
      
      System.out.println("\nINSERTION SORT");
      VetorUtil.imprimirVetor(numerosOrnenadosInsertionSort);
    }
  
  }