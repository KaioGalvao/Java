import java.util.Arrays;

public class Vetor implements VetorInterface{

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public String[] getElementos() {
        return elementos;
    }

    @Override
    public void adcionar(String elemento) {
        aumentarCapacidade();
        this.elementos[this.tamanho] = elemento;
        tamanho++;
    }
 
    @Override
    public void adcionar(int posicao, String elemento) {
        aumentarCapacidade();
        verificar(posicao);

        for(int i = this.tamanho - 1; i >= posicao; --i){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    @Override
    public void remover(int posicao) {
        verificar(posicao);

        for(int i = posicao; i < tamanho - 1; ++i ){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.elementos);
    }

    @Override
    public int buscarComNome(String elemento) {
        
        for(int i = 0; i < this.tamanho; ++i){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String buscarComPosicao(int posicao) {
        verificar(posicao);
        return this.elementos[posicao];
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.elementos.length){
            String[] novosElementos = new String[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; ++i){
                novosElementos[i] = elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    private void verificar(int posicao){
        if(! (posicao >= 0 && posicao < tamanho)){
            throw new RuntimeException("Posicao menor que zero ou maior que o tamanho do vetor");
        }
    }

}
