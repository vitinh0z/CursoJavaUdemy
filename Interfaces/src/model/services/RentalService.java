package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHoure;
    private double pricePerDay;

    private TaxService taxservice;

    public RentalService(double pricePerDay, double pricePerHoure, TaxService taxservice) {
        this.taxservice = taxservice;
        this.pricePerDay = pricePerDay;
        this.pricePerHoure = pricePerHoure;
    }

    public double getPricePerHoure() {
        return pricePerHoure;
    }

    public void setPricePerHoure(double pricePerHoure) {
        this.pricePerHoure = pricePerHoure;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxservice() {
        return taxservice;
    }

    public void setTaxservice(TaxService taxservice) {
        this.taxservice = taxservice;
    }

    public void processInvoce(CarRental carRental){

        double minutes = Duration.between(carRental.getStar(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;
        double basicPayment;

        if (hours <= 12){
            basicPayment = getPricePerHoure() * Math.ceil(hours);
        }
        else {
            basicPayment = getPricePerDay() * Math.ceil(hours / 24);
        }
        double tax = taxservice.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
