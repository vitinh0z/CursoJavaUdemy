package model.entities;

import java.util.Date;

public class Contract {

    private Integer number;
    private Date date;
    private Date totalValue;

    public Contract(Integer number, Date date, Date totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Date totalValue) {
        this.totalValue = totalValue;
    }
}
