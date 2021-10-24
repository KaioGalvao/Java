// javac Main.java
// java Main "Joao da Silva" 10.0 9.5 9.5 7.5
// java Main "Maria dos Santos" 7.0 6.5 10.0

public class Main {
    public static void main(String[] args) {
      
      String nome = args[0];
      double[] notas = new double[args.length-1]; 
    
      for(int i = 0; i < notas.length; i++){
        notas[i] = Double.parseDouble(args[i+1]);
      }
      
      double media = Estatistica.calcularMedia(notas);
      double maior = Estatistica.calcularMaior(notas);
      double menor = Estatistica.calcularMenor(notas);
      
      exibirNotas(nome,media,maior,menor);
    }
    
    // "João da Silva tem média 9.5"
    public static void exibirNotas(String nomeExibir, double notaExibir, double maiorExibir, double menorExibir) {
      
      System.out.println(String.format("%s tem média %.2f",nomeExibir, notaExibir));
      System.out.println(String.format("Maior nota: %.2f\nMenor nota: %.2f", maiorExibir,menorExibir));
  
    }
  }

