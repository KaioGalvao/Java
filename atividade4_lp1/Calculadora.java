class Calculadora{
    
    //Letra A
    public static Integer multiplicar(Integer a, Integer b){
        return a*b;
    }

    //Letra B
    public static Double multiplicar(Double a, Double b) {
        return a*b;
    }

    //Letra C
    public static Integer cubo(Integer c) {
        return c*c*c;
    }

    //Letra D
    public static String parImpar(Integer argumento){
        String par = "par";
        String impar = "impar";
        String zero = "zero";
 
        if(argumento == 0){
            return zero;
        }
        else if(argumento % 2 == 0){
            return par;
        }
        return impar;
    }
}