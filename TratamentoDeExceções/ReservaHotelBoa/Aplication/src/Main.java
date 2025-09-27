package TratamentoDeExceções.ReservaHotelBoa.Aplication.src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import TratamentoDeExceções.ReservaHotelBoa.Aplication.src.Entities.Reservation;

public class Main {
    public static void main(String[] args){
        
        try {
            Scanner read = new Scanner (System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Romm number: ");
            int number = read.nextInt();

            System.out.println("Checking Data (dd/MM/yyyy): ");
            Date checking = sdf.parse(read.next());

            System.out.println("Checking Data (dd/MM/yyyy): ");
            Date checkout = sdf.parse(read.next());

            Reservation reservation = new Reservation (number, checking, checkout);
            System.out.println("Reservation: " + reservation);

            System.out.println();

            System.out.println("Entre com data para atualizar a reserva: ");
            System.out.println("Check-in Date (dd/MM/yyyy): ");
            checking = sdf.parse(read.next());

            System.out.println("Check-out Date (dd/MM/yyyy): ");
            checkout = sdf.parse(read.next());
        } catch (ParseException e){
            System.out.println("Invalide date Format");

        } 
        catch ( e){
            System.out.println("Erro in reservaion " + e.getMessage());
        }
        
    }
}
