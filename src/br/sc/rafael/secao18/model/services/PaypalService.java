package br.sc.rafael.secao18.model.services;

public class PaypalService implements OnlinePaymentService{


    @Override
    public double paymentFee(Double amount) {
        return amount * 1.02;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return  (amount * 1.01) * months;
    }
}
