import java.time.LocalDate;

public class Atleta extends Aluno {
    private String modalidade;

    public Atleta(){
        super();
        this.modalidade = "";
    }

    public Atleta(String nome, LocalDate nascimento, String prontuario, String email, String modalidade){
        super(nome, nascimento, prontuario, email);
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String toString() {

        return super.toString() + " [modalidade: " + this.modalidade + " ]";
    }
}
