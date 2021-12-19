public class Pilha<T> implements PilhaInterface<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public Pilha(){
        cabeca = new No<>(null, null,null);
        cauda = new No<T>(cabeca, null, null);
        tamanho = 0;
    }


    private void adicionarEntre(T elemento, No<T> anterior, No<T> proximo){
        No<T> no = new No<>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho++;
    }

    private void remover(No<T> no){
        No<T> anterior = no.getAnterior();
        No<T> proximo = no.getProximo();
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
    }

    @Override
    public void empilha(T elemento) {
        adicionarEntre(elemento, cauda.getAnterior(), cauda);
    }

    @Override
    public T desempilha() {
        if (vazia()) throw new RuntimeException("Pilha vazia");
        No<T> no = cauda.getAnterior();
        remover(cauda.getAnterior());
        return no.getElemento();
    }

    @Override
    public T topo() {
        return cauda.getAnterior().getElemento();
    }

    @Override
    public int tamanho() {
        
        return tamanho;
    }

    @Override
    public boolean vazia() {
        
        return tamanho == 0;
    }
}