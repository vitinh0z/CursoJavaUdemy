package TratamentoDeExceções.ReservaHotelBoa.Aplication.src.Entities;
import java.util.Date;

public class Reservation {

    private Integer number; private Date checking; private Date checkout;


    public Reservation (){

    }


    public Reservation(Integer number, Date checking, Date checkout) {
        this.number = number;
        this.checking = checking;
        this.checkout = checkout;
    }


    public Integer getNumber() {
        return number;
    }


    public void setNumber(Integer number) {
        this.number = number;
    }


    public Date getChecking() {
        return checking;
    }


    public void setChecking(Date checking) {
        this.checking = checking;
    }


    public Date getCheckout() {
        return checkout;
    }


    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    


    
}
