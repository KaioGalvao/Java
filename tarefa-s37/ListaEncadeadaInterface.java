public interface ListaEncadeadaInterface<T> {
    void adcionarInicio(T elemento);
    void adcionarFim(T elemento);
    void removerInicio();
    void removerFim();
    T primeiro();
    T ultimo();
    int tamanho();
    boolean vazia();
    void adicionar(int posicao, T elemento);
    T buscar(int posicao);
}
