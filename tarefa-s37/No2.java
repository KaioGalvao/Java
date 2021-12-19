public class No2<T> {
    
    private No2<T> anterior;
    private T elemento;
    private No2<T> proximo;

    public No2(No2<T> anterior, T elemento, No2<T> proximo ){
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No2<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(No2<T> anterior) {
        this.anterior = anterior;
    }
    public T getElemento() {
        return elemento;
    }
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
    public No2<T> getProximo() {
        return proximo;
    }
    public void setProximo(No2<T> proximo) {
        this.proximo = proximo;
    }

}
