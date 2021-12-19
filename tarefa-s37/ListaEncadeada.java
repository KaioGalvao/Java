public class ListaEncadeada<T> implements ListaEncadeadaInterface<T>{
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaEncadeada(){
        cabeca = null;
        cauda = null;
        tamanho = 0;
    }

    @Override
    public void adcionarInicio(T elemento) {
        No<T> no = new No<T>(elemento, cabeca);
        cabeca = no;
        if (vazia()) cauda = cabeca; 
        tamanho++;
        
    }
    
    @Override
    public void adcionarFim(T elemento) {
        No<T> no = new No<T>(elemento, null);
        if (vazia()) cabeca = no;
        else cauda.setProximo(no);
        cauda = no;
        tamanho++;
    }

    @Override
    public void removerInicio() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        cabeca = cabeca.getProximo();
        tamanho--;
        if(vazia()) cauda = null;
    }

    @Override
    public void removerFim() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        No<T> ant = cabeca;
        for (int i = 0; i < tamanho-1; i++) {
            ant = ant.getProximo();
        }
        ant.setProximo(null);
        cauda = ant;
        tamanho--;
        if (vazia()) {
            cabeca = null;
            cauda = null;
        }
        
    }

    @Override
    public T primeiro() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        return cabeca.getElemento();
    }

    @Override
    public T ultimo() {
        if(vazia()) throw new RuntimeException("Lista vazia");
        return cauda.getElemento();
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
    public T buscar(int posicao) {
        if(vazia()) throw new RuntimeException("Lista vazia");
        if(!(posicao >=0  && posicao < tamanho)) throw new RuntimeException("Posicao Inválida");
        
        No<T> ant = cabeca;
        for (int i = 0; i < posicao; i++) {
            ant = ant.getProximo();
        }

        return ant.getElemento();
    }

    @Override
    public void adicionar(int posicao, T elemento) {
        if(!(posicao >=0  && posicao < tamanho)) throw new RuntimeException("Posicao Inválida");

        No<T> ant = cabeca;
        for(int i = 0; i < posicao - 1; i++) {
            ant = ant.getProximo();
        }
        No<T> no = new No<T>(elemento, ant.getProximo());
        ant.setProximo(no);
        tamanho++;
    }
}