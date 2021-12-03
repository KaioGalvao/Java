import java.util.Random;
import java.util.ArrayList;


public class Exercicio3 {
    public static void main(String[] args){

        Random random = new Random();
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();

        for(int i = 0; i < 10; ++i){
            numerosAleatorios.add(random.nextInt(100));
        }

        Integer maior = numerosAleatorios.get(0);
        for(int i = 1; i < 10; ++i) {
        if(numerosAleatorios.get(i) > maior) {
            maior = numerosAleatorios.get(i);
        }
        }
                
        System.out.println("Sequencia aleatoria de numeros:");
        System.out.println(numerosAleatorios);
        System.out.println("Maior número desta sequencia:");
        System.out.println(maior);
    }
}
