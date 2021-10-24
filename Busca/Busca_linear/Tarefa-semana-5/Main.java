public class Main {
    public static void main(String[] args) {

        String[] itens = {"Acerola", "Arroz", "Cuscuz", "Feijão", "Macarrão", "Mousse", "Suco"};
        String item = "Feijão";
    
        System.out.println(item + " na posição "+ buscaBinaria(item, itens) + " do vetor.");
    
      }
    
      public static int buscaBinaria(String elemento, String[] elementos) {
        int inicio = 0;
        int fim = elementos.length - 1;
        int meio;
    
        while(inicio <= fim) {
          meio = (int) (inicio + fim) / 2;
    
          if(elemento.compareTo(elementos[meio]) == 0) {
            return meio;
          } else if(elemento.compareTo(elementos[meio]) > 0) {
            inicio = meio + 1;
          } else 
          fim = meio -1;
          
        }
    
        return -1;
      }
}
