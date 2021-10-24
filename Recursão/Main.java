public class Main {
    public static void main(String[] args) { 
  
        int[] numeros = {6, 80};
        
        System.out.println(somaRecursiva(numeros, numeros.length));
        System.out.println(somaIterativa(numeros));
      
    }
  
    public static int somaRecursiva(int[] numeros, int quantidadeNumeros) {
        if(quantidadeNumeros == 1) {
            return numeros[n-1];
        } 
        return  somaRecursiva(numeros, quantidadeNumeros - 1) + numeros[quantidadeNumeros - 1]; 
    }
  
  
    public static int somaIterativa(int[] numeros) {
        int soma = 0;
        for(int numero : numeros){
            soma += numero;
        }
        return soma;
    }
}