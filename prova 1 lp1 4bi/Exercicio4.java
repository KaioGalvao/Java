import java.util.ArrayList;

public class Exercicio4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros=  new ArrayList<Integer>();
    
        for(int i = 1; i <= 99; i = i + 2){
            numeros.add(i);
        }
    
        Integer soma = 0;
        
        for(Integer numero : numeros ){
            soma+=numero;    
        }
    
        System.out.println(soma);
        
    }
}
