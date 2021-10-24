import java.time.LocalDate;

public class Pessoa{
    private String nome;
    private LocalDate nascimento;
    
    public Pessoa(){
        this.nome = "";
        this.nascimento = LocalDate.now();
    }

    public Pessoa(String nome, LocalDate nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }
    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String toString() {
        return "[nome: " + this.nome + ", data de nascimento: " + this.nascimento +" ]";
    }
}