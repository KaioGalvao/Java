public class ListaDuplamenteEncadeada<T> implements ListaDuplamenteEncadeadaInterface<T>{
    
    private No2<T> cabeca;
    private No2<T> cauda;
    private int tamanho;

    public ListaDuplamenteEncadeada(){
        cabeca = new No2<>(null, null, null);
        cauda = new No2<>(cabeca, null, null);
        cabeca.setProximo(cauda);
        tamanho = 0;
    }

    private void adicionarEntre(T elemento, No2<T> anterior, No2<T> proximo){
        No2<T> no = new No2<>(anterior, elemento, proximo);
        anterior.setProximo(no);
        proximo.setAnterior(no);
        tamanho++;
    }

    @Override
    public void adcionarInicio(T elemento) {
        adicionarEntre(elemento, cabeca, cabeca.getProximo());
        
    }

    @Override
    public void adcionarFim(T elemento) {
        adicionarEntre(elemento, cauda.getAnterior(), cauda);
    }

    private void remover(No2<T> no){
        No2<T> anterior = no.getAnterior();
        No2<T> proximo = no.getProximo();
        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);
        tamanho--;
    }

    @Override
    public void removerInicio() {
        if (vazia()) throw new RuntimeException("Lista vazia");
        remover(cabeca.getProximo());   
    }

    @Override
    public void removerFim() {
        if (vazia()) throw new RuntimeException("Lista vazia");
        remover(cauda.getAnterior());
    }

    @Override
    public T primeiro() {
        if (vazia()) throw new RuntimeException("Lista vazia");
        return cabeca.getProximo().getElemento();
    }

    @Override
    public T ultimo() {
        if (vazia()) throw new RuntimeException("Lista vazia");
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

    @Override
    public void adicionar(int posicao, T elemento) {
        if(posicao > tamanho || posicao < 0) throw new RuntimeException("Posição inválida");
        No2<T> ant = cabeca.getProximo();
        for(int i = 0; i < posicao - 1; i++) {
            ant = ant.getProximo();
        }
        adicionarEntre(elemento, ant, ant.getProximo());
    }

    @Override
    public T buscar(int posicao) {
        if(vazia()) throw new RuntimeException("Lista vazia");
        if(posicao > tamanho || posicao < 0) throw new RuntimeException("Posição inválida");
        No2<T> ant = cabeca.getProximo();
        for(int i = 0; i < posicao; i++) {
            ant = ant.getProximo();
        }
        return ant.getElemento();
    }
}
