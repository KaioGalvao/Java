/*
*  Escreva um programa na linguagem de programação Java que recebe um número
*  inteiro do usuário e informe se o número é par ou ímpar.
*/

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Entre com um numero");
        Integer numero = sc.nextInt();
        
        if(numero % 2 == 0){
          System.out.println(numero + " é par!");  
         
        } 
        else{
          
          System.out.println(numero + " é impar!");  
        }
        sc.close();
      }
}