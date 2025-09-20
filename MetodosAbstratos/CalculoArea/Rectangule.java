package MetodosAbstratos.CalculoArea;

public class Rectangule extends Shape{


    private double largura;
    private double altura;

    public Rectangule (){
        super();
    }

    



    public Rectangule(Color color, double largura, double altura) {
        super(color);
        this.largura = largura;
        this.altura = altura;
    }





    public double getLargura() {
        return largura;
    }





    public void setLargura(double largura) {
        this.largura = largura;
    }





    public double getAltura() {
        return altura;
    }





    public void setAltura(double altura) {
        this.altura = altura;
    }





    @Override
    public double area() {
        return getAltura() * getLargura();
    }
    
}
