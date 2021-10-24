import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        int i = 0;
        while (i < 10){
            System.out.println("Entre com algum numero");
            numeros [i] = sc.nextInt();
            i++;            
        }
        System.out.println("Maior número: " + calcularMaior(numeros));
        sc.close();
    }

    public static int calcularMaior (int[] valores) {
        int maiorValor = 0;
        for(int valor : valores){
            if(valor > maiorValor){
            maiorValor = valor;
            }
        }
        return maiorValor;
    }
}