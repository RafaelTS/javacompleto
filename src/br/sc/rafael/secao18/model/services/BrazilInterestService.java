package br.sc.rafael.secao18.model.services;

public class BrazilInterestService implements InterestService{

    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestService() {
        return interestRate;
    }
}
