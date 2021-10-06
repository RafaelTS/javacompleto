package br.sc.rafael.secao18.model.services;

public class PaypalService implements OnlinePaymentService{
	
	public static final double PAYMENT_FEE = 0.02;
	public static final double MONTLY_INTEREST = 0.01;

	@Override
    public double paymentFee(Double amount) {
        return amount * PAYMENT_FEE;
    }

    @Override
    public double interest(Double amount, Integer months) {
        return amount * months * MONTLY_INTEREST;
    }
}
