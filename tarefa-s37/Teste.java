public class Teste {
    public static void main(String[] args){


        ListaDuplamenteEncadeada<String> list = new ListaDuplamenteEncadeada<>();
        list.adcionarFim("Ola");
        list.adcionarFim(" Mundo!");
        list.adcionarInicio("Heyhey! ");
        System.out.println(list.buscar(0)+","+ list.buscar(1) +","+list.buscar(2));
        list.removerInicio();
        list.adicionar(2, "  Tudo bem?");
        System.out.println(list.buscar(0)+","+ list.buscar(1) +""+list.buscar(2));

    }
}
