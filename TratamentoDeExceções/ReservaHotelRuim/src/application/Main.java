package TratamentoDeExceções.ReservaHotelRuim.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import TratamentoDeExceções.ReservaHotelRuim.src.model.entities.Reservation;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto: ");
            int roomNumber = sc.nextInt();
            System.out.print("Data de check-in (dd/MM/yyyy): ");
            Date checking = sdf.parse(sc.next());
            System.out.print("Data de check-out (dd/MM/yyyy): ");
            Date checkout = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checking, checkout);
            System.out.println("Reserva: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Formato de data invalido");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Erro: Entrada invalida. Por favor, insira um numero para o quarto.");
        }
        sc.close();
    }
}