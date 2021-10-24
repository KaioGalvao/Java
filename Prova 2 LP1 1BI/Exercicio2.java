
import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 = 0, numero2 = 0;
       
        do{
            System.out.println("Digite um número para ser incial do contador");
            numero1 = sc.nextInt();
            System.out.println("Digite outro número para ser o final do contador");
            numero2 = sc.nextInt();
            
            if(numero1 <= numero2){
                int i = numero1;
                System.out.println("\n\n");
                while(i <= numero2){
                    System.out.println(i);
                    ++i;
                }
            }
        }while(numero1 > numero2);
        sc.close();
    }
}    