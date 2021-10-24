import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("\t\tSEM ZEROS");
    System.out.println("Tamanho do vetor:");
    int tamanhoVetor = sc.nextInt();

    System.out.println("Elementos:");
    int[] vetorEntrada = new int[tamanhoVetor];
    for(int i=0; i < tamanhoVetor; ++i ){
      vetorEntrada[i] = sc.nextInt();
    }
    int[] primeiroMetodo = VetorUtil.vetorZero(vetorEntrada);
    
    System.out.println("Vetor sem zeros:");
    exibirVetor(primeiroMetodo);
    //
    //
    System.out.println("\t\tPOSIÇÃO DO VETOR");
    
    System.out.println("Tamanho do vetor");
    int tamanhoVetor2 = sc.nextInt();

    System.out.println("Elementos do vetor");
    int[] elementosVetor2 = new int[tamanhoVetor2];
    for(int i=0; i < tamanhoVetor2; ++i ){
      elementosVetor2[i] = sc.nextInt();
    }

    System.out.println("Elemento pesquisado");
    int pesquisarElemento = sc.nextInt();

    
    int[] segundoMetodo = VetorUtil.posicaoVetor(elementosVetor2, pesquisarElemento);
    System.out.println("Vetor com posicões:");
    exibirVetor(segundoMetodo);
    //
    //
    System.out.println("\t\tINTERSEÇÃO");

    System.out.println("Tamanho vetor 1:");
    int tamanhoVetor3 = sc.nextInt(); 
    
    System.out.println("Elementos vetor 1:");
    int[] elementosVetor3 = new int[tamanhoVetor3];
    for(int i=0; i < tamanhoVetor3; ++i ){
      elementosVetor3[i] = sc.nextInt();
    }
    
    System.out.println("Tamanho vetor 2:");
    int tamanhoVetor4 = sc.nextInt();
   
    System.out.println("Elementos vetor 2:");
    int[] elementosVetor4 = new int[tamanhoVetor4];
    for(int i=0; i < tamanhoVetor4; ++i ){
      elementosVetor4[i] = sc.nextInt();
    }

    int[] resultado = VetorUtil.intersecaoVetor(elementosVetor3, elementosVetor4);
    System.out.println("Interseção do Vetor");
    exibirVetor(resultado);

    sc.close();
  }

  public static void exibirVetor(int[] valores){
    for(int i=0; i < valores.length; ++i ){
      System.out.println(valores[i]);
    }
    System.out.println("-------------------------------------");
  }
}