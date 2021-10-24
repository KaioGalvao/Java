/*
* Faça um programa Java que solicita a idade de uma pessoa e 
* informa se ela pode votar (idade>=16).
*/


import java.util.Scanner;

public class Urna {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Qual sua idade?");
    Integer idade = sc.nextInt();

    if(idade >= 16){
      
      System.out.println("Sua idade é " + idade + " anos, você pode votar!");
    } 
    else{
      
      System.out.println("Sua idade é " + idade + " anos, você não pode votar!");
    }

    sc.close();    
  }
}