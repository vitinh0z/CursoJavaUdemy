package TratamentoDeExceções.ReservaHotelRuim.src.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;



public class Reservation {

    private Integer roomNumber;
    private Date checkIng;
    private Date checkOut;

    public Reservation (){

    }

   public Reservation (Integer roomNumber, Date checkIng, Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIng = checkIng;
        this.checkOut = checkOut;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getRoomNumber() {
        if (roomNumber < 0){
            throw new IllegalArgumentException("Quarto deve ser maior que 0");
        }
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIng() {
        return checkIng;
    }  

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){

        if (checkIng.getTime() > checkOut.getTime()){
            throw new IllegalArgumentException("Saida deve ser maior que a entrda");
        }
        long diff = checkOut.getTime() - checkIng.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    @Override
    public String toString() {
        return "Quarto: " + getRoomNumber() + " | Data Checking: " + sdf.format(getCheckIng()) + " | Data Checkout: "+ sdf.format(getCheckOut()) + "Duration: " + duration() + "Nights";
    }


    
    
}
