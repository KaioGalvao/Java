public interface FilaInterface<T> {
    void enfileirar(T elemento);
    T desenfileirar();
    T primeiro();
    int tamanho();
    boolean vazia();
}
