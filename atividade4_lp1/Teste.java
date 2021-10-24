public class Teste{
    public static void main(String[] args){
        System.out.println(Calculadora.multiplicar(3, 7));
        System.out.println(Calculadora.multiplicar(2.5, 10.0));
        System.out.println(Calculadora.cubo(2));
        System.out.println(Calculadora.parImpar(6));

        System.out.println(MenorNumero.min3(0,2,3));
        System.out.println(MenorNumero.min3(20,12,34));
        System.out.println(MenorNumero.min3(10,8,5));

        System.out.println(MenorNumero.min3(1.2,2.5,3.1));
        System.out.println(MenorNumero.min3(2.0,1.9,3.1));
        System.out.println(MenorNumero.min3(12.2,25.7,3.1));

        Tempo t1 = new Tempo(5, 27, 42);

        t1.imprimir();
        System.out.println("Horas:" + t1.getHoras()+ "\nMinutos:" + t1.getMinutos() + "\nSegundos:" + t1.getSegundos() );
        System.out.println( t1.getHoras()  + " horas é " +t1.horasEmSegundos() + " segundos");
        System.out.println( t1.getMinutos() + " minutos é " +  t1.minutosEmSegundos() + " segundos");
        
    }
}
