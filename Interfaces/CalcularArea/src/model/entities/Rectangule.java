package model.entities;

public class Rectangule extends Forms{

    private Double lado;
    private Double altura;

    public Rectangule() {
    }

    public Rectangule(Double lado, Double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return  getLado() * getAltura();
    }
}
