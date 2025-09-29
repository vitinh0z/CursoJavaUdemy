package model.entities;

public class Circle extends Forms{

    private Double raio;

    public Circle() {
    }

    public Circle(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return PI * (getRaio()*getRaio());
    }


}
