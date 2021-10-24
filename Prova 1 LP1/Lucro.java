/* 
*  Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor
*  da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Elabore
*  um programa que leia o valor do produto e imprima o valor de venda para o produto.
*/


import java.util.Scanner;

public class Lucro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Valor comprado do produto");
    Double valorProduto = sc.nextDouble();
    
    if(valorProduto < 20.00){
      System.out.println(String.format("lucro de R$ %.2f",(valorProduto*0.45)));  
      System.out.println(String.format("Valor da Venda: R$ %.2f ",(valorProduto*1.45)));
    } 
    else{
      System.out.println(String.format("lucro de R$ %.2f",(valorProduto*0.3)));  
      System.out.println(String.format("Valor da Venda: R$ %.2f ",(valorProduto*1.3))); 
    }
    
    sc.close();
  }
}