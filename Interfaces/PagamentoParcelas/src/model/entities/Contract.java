package model.entities;

import java.util.Date;

public class Contract {

    private Integer number;
   private LocalDate localDate;
    private Date totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract(Integer number, Date localDate, Date totalValue) {
        this.number = number;
        this.localDate = localDate;
        this.totalValue = totalValue;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Date totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

}
