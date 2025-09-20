package MetodosAbstratos.ContaBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        


       List<Account> list = new ArrayList<>();
       list.add(new SavingAccount(1001, "Alex", 500.0, 0.01));
       list.add(new BussinesAccount(1002, "Maria", 500.0, 400.0));
       list.add(new BussinesAccount(21, "Ana", 400.0, 600.0));

       double soma = 0;

       for (Account account : list) {

            soma += account.getBalance();
       }

       System.out.println("Soma: " + soma);

       for (Account account : list){

            account.deposit(10.);
        }

       for (Account account : list) {
            System.out.printf("COnta atualizada: %d | Saldo: %f\n", account.getNumber(), account.getBalance());
        }

    }



}