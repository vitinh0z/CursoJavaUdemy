package LivrodeJava;

public class Hora {
    

    public int hora, min, seg;


    public void setHorario (int h, int m, int s){
        hora = h;
        min = m;
        seg = s;

    }

    public String toString(){
        return hora + ":" + min + ":" + seg;
    }


    

}
