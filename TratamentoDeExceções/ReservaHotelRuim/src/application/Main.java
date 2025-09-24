package TratamentoDeExceções.ReservaHotelRuim.src.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import TratamentoDeExceções.ReservaHotelRuim.src.model.entities.Reservation;

public class Main {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Reservation reservation = null;

        try {

        Date checking = sdf.parse("1/5/20");
        Date checkout = sdf.parse("2/1/2");

        

        reservation = new Reservation(0, checking, checkout);

        } catch (IllegalArgumentException e){
            e.getMessage();
            
        } catch (ParseException e){
            System.out.println("ERRO: Formato da data errada");
        }

        System.out.println(reservation);

        




    }
    
}
