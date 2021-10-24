import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String prontuario;
    private String email;

    public Aluno(){
        super();
        this.email = "";
        this.prontuario = "";
    }

    public Aluno(String nome, LocalDate nascimento, String prontuario, String email){
        super(nome, nascimento);
        this.prontuario = prontuario;
        this.email = email;
    }

    public String getProntuario() {
        return prontuario;
    }
    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public String toString() {
        return super.toString() + " [prontuário: " + this.prontuario + ", email: " + this.email + " ]";
    }
}