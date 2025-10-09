package services;

import model.entities.Contract;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService (OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }


    public void processContract (new Contract(), Integer months){
        System.out.print("null");
    }
}
