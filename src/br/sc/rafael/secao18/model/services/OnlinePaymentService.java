package br.sc.rafael.secao18.model.services;

public interface OnlinePaymentService {

    double paymentFee(Double amount);

    double interest(Double amount, Integer months);


}
