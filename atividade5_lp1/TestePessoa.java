import java.time.LocalDate;

public class TestePessoa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Kaio", LocalDate.now());
        System.out.println( p1.toString() );


        Aluno a1 = new Aluno("Kaio", LocalDate.now(), "SP3044131", "Kkaiovsa@outlook.com.br");
        System.out.println( a1.toString());
        
        Bolsista b1 = new Bolsista("Kaio", LocalDate.now(), "SP3044131", "Kkaiovsa@outlook.com.br", 580.00);
        System.out.println(b1.toString());

        Atleta at1 = new Atleta("Kaio", LocalDate.now(), "SP3044131", "Kkaiovsa@outlook.com.br", "Atletismo");
        System.out.println(at1.toString());
    }
}
