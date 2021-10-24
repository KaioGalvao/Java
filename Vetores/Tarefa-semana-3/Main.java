import java.util.Scanner;

public class Semana3 {
  public static void main(String[] args) {
    Scanner nm = new Scanner(System.in);
    
    System.out.println("Entre com número de elementos:");
    int quantidadeNumeros = nm.nextInt();
    int[] numeros = new int[quantidadeNumeros];
    
    for(int i = 0; i< quantidadeNumeros; ++i){
      System.out.println("Entre com número " + (1 + i));
      numeros[i] = nm.nextInt();
    }
    
    for(int i=0;i<quantidadeNumeros;++i){
      for(int j=i+1; j<quantidadeNumeros;++j){
        if(numeros[i]>numeros[j]){
          int auxiliar; 
          auxiliar=numeros[i];
          numeros[i] = numeros[j];
          numeros[j] = auxiliar;
        }
      }
    }
   
    System.out.println("Maior número: " + (numeros[quantidadeNumeros - 1]));
    System.out.println("Menor número: " + numeros[0]);   
    
    nm.close();
  }
}