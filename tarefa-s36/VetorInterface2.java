public interface VetorInterface2<T> {
    void adicionar(T elemento);
    void adicionar(int posicao, T elemento);
    void remover(int posicao);
    T buscar(int posicao);
    int buscar(T elemento);
    int tamanho();
    boolean contem(T elemento);
}
