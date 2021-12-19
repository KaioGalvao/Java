public class Main {
    public static void main(String[] args){

        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        list.adcionarInicio(5);
        list.adcionarFim(8);
        list.adcionarInicio(2);
        System.out.println(list.buscar(0)+","+ list.buscar(1) +","+list.buscar(2));
        list.adicionar(2, 2);
        System.out.println(list.buscar(0) +","+ list.buscar(1) +","+ list.buscar(2) +","+ list.buscar(3));

    }
}
