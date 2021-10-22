package br.sc.rafael.secao18.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.sc.rafael.secao18.model.entities.Contract;
import br.sc.rafael.secao18.model.entities.Installment;
import br.sc.rafael.secao18.model.services.ContractService;
import br.sc.rafael.secao18.model.services.PaypalService;

public class ContractProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();
        
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installments);
        
        System.out.println("Installments: ");
        for (Installment it : contract.getInstallments()) {
        	System.out.println(it);
        }

        sc.close();
    }
}
