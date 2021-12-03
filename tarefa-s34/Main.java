public class Main {
    public static void main(String[] args){

        Vetor v1 = new Vetor(5);
        v1.adcionar("Camilla");
        v1.adcionar("Loi");
        v1.adcionar("Lola");
        v1.adcionar("Casemiro");
        v1.adcionar("Rangel");
        v1.tamanho();
        v1.toString();
        System.out.println(v1.toString());
        v1.remover(4);
        v1.adcionar("Jess");
        System.out.println(v1.toString());
        System.out.println(v1.buscarComPosicao(2));
        System.out.println(v1.buscarComNome("Jess"));
        System.out.println(v1.tamanho());
        v1.adcionar(2, "Kaio");
        System.out.println(v1.toString());
        System.out.println(v1.tamanho());
    

        VetorInt vt1 = new VetorInt(6);
        vt1.adcionar(3);
        vt1.adcionar(2);
        vt1.adcionar(30);
        vt1.adcionar(21);
        vt1.adcionar(8);
        vt1.adcionar(100);
        System.out.println(vt1.toString());
        vt1.remover(3);
        vt1.adcionar(3, 80);
        System.out.println(vt1.toString());
        vt1.adcionar(5, 5);
        System.out.println(vt1.toString());
        vt1.adcionar(3);
        vt1.adcionar(2);
        vt1.adcionar(30);
        vt1.adcionar(21);
        System.out.println(vt1.toString());
        System.out.println(vt1.buscarComPosicao(5));
        System.out.println(vt1.buscarComElemento(8) + ", " + vt1.buscarComPosicao(8));
        
        vt1.remover(12);
        v1.remover(-10);
    }
}
