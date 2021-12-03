import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Kaio");
        nomes.add("Luffy");
        nomes.add("Zoro");
        nomes.add("Nami");
        nomes.add("Robin");

        System.out.println("Escreva um nome para ser excluído:\n1 - Kaio\n2 - Luffy\n3 - Zoro\n4 - Nami\n5 - Robin");
        nomes.remove(sc.nextLine());

        System.out.println("Nova lista de nomes:\n" + nomes);

        sc.close();
    }
}
