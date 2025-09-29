package model.entities;

public class Triangle extends Forms {

    private Double base;
    private Double altura;

    public Triangle() {
    }

    public Triangle(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return (getBase() * getAltura() / 2);
    }
}
