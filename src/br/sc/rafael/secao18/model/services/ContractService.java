package br.sc.rafael.secao18.model.services;

import br.sc.rafael.secao18.model.entities.Contract;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

    }
}
