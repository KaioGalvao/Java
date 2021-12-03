import java.util.Arrays;

public class VetorInt implements VetorIntInterface {
    
    private Integer[] numeros;
    private int tamanho;

    public VetorInt(int capacidade){
        this.numeros = new Integer[capacidade];
        this.tamanho = 0;
    }

    
    public Integer[] getElementos() {
        return numeros;
    }

    @Override
    public void adcionar(Integer numero) {
        aumentarCapacidade();
        this.numeros[this.tamanho] = numero;
        tamanho++;
    }
 
    @Override
    public void adcionar(int posicao, Integer numero) {
        aumentarCapacidade();
        verificar(posicao);

        for(int i = this.tamanho - 1; i >= posicao; --i){
            this.numeros[i+1] = this.numeros[i];
        }

        this.numeros[posicao] = numero;
        this.tamanho++;
    }

    @Override
    public void remover(int posicao) {
        verificar(posicao);

        for(int i = posicao; i < tamanho - 1; ++i ){
            this.numeros[i] = this.numeros[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.numeros);
    }

    @Override
    public int buscarComElemento(Integer numero) {
        
        for(int i = 0; i < this.tamanho; ++i){
            if(this.numeros[i] == numero){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer buscarComPosicao(int posicao) {
        verificar(posicao);
        return this.numeros[posicao];
    }

    @Override
    public int tamanho() {
        return this.tamanho;
    }

    private void aumentarCapacidade(){
        if(this.tamanho == this.numeros.length){
            Integer[] novosElementos = new Integer[this.numeros.length + 1];
            for(int i = 0; i < this.numeros.length; ++i){
                novosElementos[i] = numeros[i];
            }
            this.numeros = novosElementos;
        }
    }

    private void verificar(int posicao){
        if(! (posicao >= 0 && posicao < tamanho)){
            throw new RuntimeException("Posicao menor que zero ou maior que o tamanho do vetor");
        }
    }

}
