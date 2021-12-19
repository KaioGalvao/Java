public interface PilhaInterface<T> {
    void empilha(T elemento);
    T desempilha();
    T topo();
    int tamanho();
    boolean vazia();
}
