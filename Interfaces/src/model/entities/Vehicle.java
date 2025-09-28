package model.entities;

public class Vehicle {
    private String mode;

    public Vehicle(){

    }

    public Vehicle(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
