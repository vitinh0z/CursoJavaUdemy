package Composicao.PedidoCliente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    private String name;
    private String email;
    private Date birthdate;


    public Cliente (){

    }


    public Cliente(String name, String email, Date birthdate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    public Cliente(String name, String email, String birthdate) throws ParseException {
        this.name = name;
        this.email = email;
        this.birthdate = sdf.parse(birthdate);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Date getBirthdate() {
        return birthdate;
    }


    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    







}
