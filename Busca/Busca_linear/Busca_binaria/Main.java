public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 4, 5, 7, 9, 11, 15};
        int numero = 15;
        int posicaoEncontrada = buscaBinaria(numero, numeros);
        System.out.println(posicaoEncontrada);
    }
  
    public static int buscaBinaria(int elemento, int[] elementos) {
        int inicio = 0;
        int fim = elementos.length - 1;
        int meio;
    
        while(inicio <= fim) {
            meio = (int) (inicio + fim) / 2;
    
            if(elemento == elementos[meio]) {
            return meio;
            } else if(elemento > elementos[meio]) {
            inicio = meio + 1;
            } else {
            fim = meio -1;
            }
        }
  
        return -1;
    }
}