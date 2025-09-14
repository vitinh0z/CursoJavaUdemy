package UpcastingEDowncasting;

public class Main {

    public static void main(String[] args) {
        

        Account acc = new Account(1001, "Alexandre", 0.0);

        BussineAccount bcc = new BussineAccount(111, "fernando", 21.1, 500);


        //Upcasting

        Account acc1 = bcc;
        Account acc2 = new BussineAccount(1111, "SuelleN", 200.0, 100);
        Account acc3 = new SavingAccount(2121, "Victor", 2121.1, 2012.1);

        //DownCasting

        BussineAccount acc4 = (BussineAccount)acc2;
        acc4.loan(100.0);

        // BussineAccount acc5 = (BussineAccount)acc3; ------> não pode

        if (acc3 instanceof BussineAccount){
            BussineAccount acc5 = (BussineAccount)acc3;
            acc5.loan(200);
            System.out.println("Emprestimo");
        }

        if (acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }




    }
    
}
