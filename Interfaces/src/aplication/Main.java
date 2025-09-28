package aplication;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com dados do aluguel: ");

        System.out.println("Modelo do Carro: ");
        String carModel = scanner.nextLine();

        System.out.println("Retirada do Veiculo (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        System.out.println("Retorno do Veiculo (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com valor por hora: ");
        double pricePerHour = scanner.nextDouble();

        System.out.print("Entre com valor por dia: ");
        double pricePerDay = scanner.nextDouble();;

        RentalService rentalService = new RentalService(pricePerDay,pricePerHour, new BrazilTaxService());

        rentalService.processInvoce(carRental);

        System.out.print("FATURA: ");
        System.out.println("Pagamento Basico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

    }
}