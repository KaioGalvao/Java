public interface VetorInterface {
    void adicionar(Object elemento);
    void adicionar(int posicao, Object elemento);
    void remover(int posicao);
    Object buscar(int posicao);
    int buscar(Object elemento);
    int tamanho();
}
