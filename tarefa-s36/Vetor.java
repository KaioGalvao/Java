import java.util.Arrays;

public class Vetor implements VetorInterface {
    
    private Object[] elementos;
    private int tamanho;

    public Vetor( int capacidade){
        elementos = new Object[capacidade];
        tamanho = 0;
    }

    private void aumentarCapacidade(){
        if(tamanho == elementos.length){
            Object[] elementosNovos = new Object[elementos.length * 2];
            
            for(int i = 0; i < tamanho; i++){
                elementosNovos[i] = elementos[i];
            }
            elementos = elementosNovos;
        }
    }

    @Override
    public void adicionar(Object elemento) {
        aumentarCapacidade();
        elementos[tamanho] = elemento;
        tamanho++;
    }

    @Override
    public void adicionar(int posicao, Object elemento) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new RuntimeException("Argumento inválido");
        }
        
        aumentarCapacidade();
        for(int i = tamanho - 1; i>= posicao; --i){
            elementos[i+1] = elementos[i];
        }      

        elementos[posicao] = elemento;
        tamanho++;
    }

    @Override
    public void remover(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new RuntimeException("Argumento inválido");
        }

        for(int i = posicao; i < tamanho-1; ++i){
            elementos[i] = elementos[i+1];
        }
        tamanho--;

        elementos[tamanho] = null;
    }

    @Override
    public int buscar(Object elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Object buscar(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new RuntimeException("Argumento inválido");
        }

        return elementos[posicao];
    }

    @Override
    public int tamanho() {
        return tamanho;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }

}
