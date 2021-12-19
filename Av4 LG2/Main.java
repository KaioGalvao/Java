public class Main {
    public static void main(String[] args) {
        
        //Pilha foi feito utilizando Lista Duplamente Encadeada
        System.out.println("Pilha");
        Pilha<String>  p = new Pilha<>();
        p.empilha("Prato 1");
        p.empilha("Prato 2");
        p.empilha("Prato 3");
        System.out.println("Primeiro da pilha: " + p.topo()); 
        System.out.println("Desempilhar o primeiro da pilha: " + p.desempilha());
        System.out.println("Novo primeiro da pilha: " + p.topo());
        System.out.println("Tamanho da lista: " + p.tamanho());
        System.out.println("Lista vazia: " + p.vazia());

        System.out.println("\n\n\nFila:");

        //Fila foi feito utilizando Vetores
        Fila<String> f = new Fila<>(3);
        f.enfileirar("Carlinhos");
        f.enfileirar("Marlene");
        f.enfileirar("Creuza");
        f.enfileirar("Claudio");
        System.out.println("Primeiro da fila: " + f.primeiro());
        System.out.println("Desenfileirar o primeiro: " + f.desenfileirar());
        System.out.println("Novo primeiro da fila: " + f.primeiro());
        System.out.println("Tamanho da fila: " + f.tamanho());
        System.out.println("Fila está vazia: " + f.vazia());

        
    }

}
