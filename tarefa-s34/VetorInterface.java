public interface VetorInterface{
    public void adcionar(String elemento); 
    public void adcionar(int posicao, String elemento); 
    public void remover(int posicao); 
    public String buscarComPosicao(int posicao);
    public int buscarComNome(String elemento);
    public int tamanho();
}