

public class Quest3 {
    public static void main(String[] args){
        Integer numero = null;
        String numeroString = null;
        
       try {
           numeroString = Integer.toString(numero);
        } 
       catch (NullPointerException e) {
           numero = 5;
           numeroString =  Integer.toString(numero) + " Agora é String!";
        }
       finally{
           System.out.println(numeroString);
        }
       
    }
}
