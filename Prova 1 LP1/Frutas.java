/*
*  As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, 
*  e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia
*  o número de maçãs compradas, calcule e escreva o valor total da compra.
*/

import java.util.Scanner;

public class Frutas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Quantas maçãs foram compradas?");
    Integer quantidadeFruta = sc.nextInt();
    
    if(quantidadeFruta < 12){
      double total = quantidadeFruta.doubleValue();

      System.out.println(String.format("Valor total da compra: R$ %.2f ",(total*0.3)));  
      
    } 
    else{
      double total = quantidadeFruta.doubleValue();
      System.out.println(String.format("Valor total da compra: R$ %.2f ",(total*0.25))); 
    }
    sc.close();
  }
}