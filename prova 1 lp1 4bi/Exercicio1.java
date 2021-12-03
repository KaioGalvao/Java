import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Escreva cinco nomes:");
        for(int i = 0; i < 5; i++){
            nomes.add(sc.nextLine());
        }

        System.out.println("\n\nNomes com as ordens trocadas:");
        for(int i = 4; i >= 0; i--){
            System.out.println(nomes.get(i));
        }

        sc.close();
    }
}