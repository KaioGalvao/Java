public class Main {
    public static void main(String[] args) {
        String[] itens = {"Arroz", "Feijão", "Macarrão"};
        String item = "Macarrão";
    
        int posicaoEncontrada = buscaLinear(item, itens);
    
        System.out.println(posicaoEncontrada);
    
        if(posicaoEncontrada >= 0){
            System.out.println(itens[posicaoEncontrada]);
        }
    
        System.out.println(contem("Arroz", itens));
        System.out.println(contem("Feijão", itens));
        System.out.println(contem("Macarrão", itens));
        System.out.println(contem("Bolo", itens));
        System.out.println(contem("Pastel", itens));
    
    
        int[] numeros = {9, 10, 5, 1, 3};
        int numero = 8;
    
        int posicaoEncontrada2 = buscaLinear(numero, numeros);
    
        System.out.println(posicaoEncontrada2);
  
    }
  
    // indexOf
    public static int buscaLinear(String elemento, String[] elementos) {
        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i].equals(elemento)) {
            return i;
            } 
        }
        return -1;
    }
  
    // contains
    public static boolean contem(String elemento, String[] elementos) {
        return buscaLinear(elemento, elementos) != -1;
    }
  
    // indexOf
    public static int buscaLinear(int elemento, int[] elementos) {
        for(int i = 0; i < elementos.length; i++) {
            if(elementos[i] == elemento) {
            return i;
            } 
        }
        return -1;
    }
  
    // contains
    public static boolean contem(int elemento, int[] elementos) {
        return buscaLinear(elemento, elementos) != -1;
    }
  
}