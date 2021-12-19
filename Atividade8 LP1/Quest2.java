import java.util.InputMismatchException;
import java.util.Scanner;

public class Quest2{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int valor = 0;
        boolean teste = false;
       
        do{
            try {
                System.out.println("Entre com um valor inteiro:");
                valor = sc.nextInt();
                teste = true;
            } catch (InputMismatchException e) {
                teste = false;
                sc.nextLine();
            }
        }while(teste == false);
        
        System.out.println("Valor inserido:" + valor);

        sc.close();
    }
}