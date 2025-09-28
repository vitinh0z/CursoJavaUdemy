package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHoure;
    private double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(BrazilTaxService taxService, double pricePerDay, double pricePerHoure) {
        this.taxService = taxService;
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

    public BrazilTaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(BrazilTaxService taxService) {
        this.taxService = taxService;
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
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
