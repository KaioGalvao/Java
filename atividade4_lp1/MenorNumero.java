class MenorNumero{
    public static Integer min3(Integer a, Integer b, Integer c){
       if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else if(c<b && c<a)
           return c;
        else 
       return 0;
    }

    public static Double min3(Double a, Double b, Double c){
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else if(c<a && c<b)
            return c;
        else 
        return 0.0;
    }
}