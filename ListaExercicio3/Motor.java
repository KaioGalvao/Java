public class Motor {
    private String tipo;
    private Double tamanho;

    public Motor(){
        this.tipo = "";
        this.tamanho = 0.0;
    }

    public Motor(String tipo, Double tamanho){
        this.tipo = tipo;
        this.tamanho = tamanho;
    }
    
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Double getTamanho() {
        return tamanho;
    }
    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

}
