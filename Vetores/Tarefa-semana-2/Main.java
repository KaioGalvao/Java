import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
    
        System.out.println("Entre com notas:");
        int quantidadeNotas = nota.nextInt();
    
        double[] notas = new double[quantidadeNotas];
    
        for (int i = 0; i < quantidadeNotas; i++) {
          System.out.println("Entre com nota " + (i + 1));
          notas[i] = nota.nextDouble();
        }
        
        double media = 0;
        for (int i = 0; i < quantidadeNotas; ++i) {
          media += notas[i];
        }
        
        System.out.println(String.format("A media eh %.2f",media/quantidadeNotas));
        
        nota.close();
      }
}
