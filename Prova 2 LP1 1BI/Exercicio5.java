import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Digite um número para fazer uma tabuada");
        int numero = sc.nextInt();
        
        for(int i = 1; i<=10; ++i){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
        
        sc.close();
    }
}