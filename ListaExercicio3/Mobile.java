public class Mobile {
    private String modelo;
    private String  marca;
    private CartaoSim cartao;

    public Mobile(){
        this.modelo = "";
        this.marca = "";
        this.cartao = new CartaoSim();
    }

    public Mobile(String modelo, String marca, CartaoSim cartao){
        this.modelo = modelo;
        this.marca = marca;
        this.cartao = cartao;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public CartaoSim getCartao() {
        return cartao;
    }
    public void setCartao(CartaoSim cartao) {
        this.cartao = cartao;
    }
}
