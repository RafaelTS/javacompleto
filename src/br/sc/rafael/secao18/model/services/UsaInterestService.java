package br.sc.rafael.secao18.model.services;

public class UsaInterestService implements InterestService{

    private double interestRate;

    @Override
    public double getInterestService() {
        return interestRate;
    }

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }
}
