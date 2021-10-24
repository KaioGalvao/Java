public class Estatistica {
    public static double calcularMedia(double[] valores) {
      double soma = 0.0;
      for(double valor : valores) {
        soma += valor;
      }
      return soma / valores.length;
    }
   
    public static double calcularMaior (double [] valores) {
     double maiorNota = 0.0;
     for(double valor : valores){
       if(valor > maiorNota){
          maiorNota = valor;
        }
      }
      return maiorNota;
    }
    
    public static double calcularMenor (double [] valores) {
     double menorNota = valores[0];
     for(double valor : valores){
        if(valor < menorNota){
          menorNota = valor;
        }
      }
      return menorNota;
    }
  }