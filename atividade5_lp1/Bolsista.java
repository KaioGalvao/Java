import java.time.LocalDate;

public class Bolsista extends Aluno {
    private Double valor;

    public Bolsista(){
        super();
        this.valor = 0.0;
    }

    public Bolsista(String nome, LocalDate nascimento, String prontuario, String email, Double valor){
        super(nome, nascimento, prontuario, email);
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public String toString() {
        
        return super.toString() + " [valor: R$" + this.valor + " ]";
    }
}