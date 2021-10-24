import java.time.LocalTime;

public class Tempo {
    private Integer horas;
    private Integer minutos;
    private Integer segundos;
    

    public Tempo(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(Integer horas, Integer minutos, Integer segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Letra A
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }
    public Integer getMinutos() {
        return minutos;
    }
    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }
    public Integer getSegundos() {
        return segundos;
    }
    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }

    //Letra B
    public void imprimir(){
        LocalTime imprima = LocalTime.of(horas,minutos,segundos);

        System.out.println(imprima);
    }    

    //Letra C
    public Integer horasEmSegundos() {
        if(horas >= 1){
            return horas*3600;
        } else
        return 0;
        
    }

    //Letra D
    public Integer minutosEmSegundos() {
        if(minutos >= 1){
            return minutos*60;
        } else
        return 0;  
    }
}
