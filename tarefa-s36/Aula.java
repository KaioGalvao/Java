public class Aula{
    public static void main(String[] args) {
        Vetor v1 = new Vetor(2);

        System.out.println(v1);
        v1.adicionar("3");
        v1.adicionar("Mundo");
        System.out.println(v1);

        Vetor v2 = new Vetor(2);
        v2.adicionar(2);
        v2.adicionar(5);
        System.out.println(v2);

        String palavra = (String) v1.buscar(0);
        System.out.println(palavra);


        Vetor2<String> v3 = new Vetor2<>(2);
        v3.adicionar("Eu sou");
        v3.adicionar("o Homem de Ferro");
        System.out.println(v3);
        System.out.println(v3.contem("Eu sou"));
        v3.remover(0);
        System.out.println(v3.contem("Eu sou"));
        
        String heroi = v3.buscar(0);
        System.out.println(heroi);
    }
}