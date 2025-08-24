

public class rectangule {


    public double height;
    public double widht;


    public double area () {
        return height * widht;

    }

    public double Perimeter(){
        return height + height + widht * widht;
    }

    public double Diagonal(){
        return Math.sqrt((height * height) + (widht * widht));
    }


}