/*  Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
*    A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
*
*    ACESSO PERMITIDO caso a senha seja válida.
*    ACESSO NEGADO caso a senha seja inválida. 
*/

import java.util.Scanner;

public class Senha {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Senha:");
    String senha = sc.nextLine();

    if(senha.equals("1234")){
      
      System.out.println("ACESSO PERMITIDO");
    } 
    else{
      
      System.out.println("ACESSO NEGADO");
    }  

    sc.close();  
  }
}