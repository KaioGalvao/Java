
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numero = 0, somaNumeros = 0, i = 0;
        
        
        do{
            System.out.println("Digite algum número, ou 0");
            numero = sc.nextInt();
            
            somaNumeros += numero; 
            i++;
            
        }while(numero > 0);
        
        double media = somaNumeros.doubleValue();
        
        System.out.println("Foram digitados:" + i); 
        System.out.println(String.format("Media:%.1f ",(media/i)));
        sc.close();
    }
}