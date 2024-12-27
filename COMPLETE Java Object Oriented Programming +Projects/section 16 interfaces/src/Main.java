import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.println("retorno(dd/MM/yyyy): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preco por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preco por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA: ");
        System.out.println("Pagamento basico: "+ cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}