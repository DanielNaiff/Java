package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerDay;
    private  Double getPricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double getPricePerHour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.getPricePerHour = getPricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;

        if(hours <= 12.0){
            basicPayment = pricePerDay * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);


        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
