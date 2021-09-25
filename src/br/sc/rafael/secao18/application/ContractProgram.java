package br.sc.rafael.secao18.application;

import br.sc.rafael.secao18.model.entities.Contract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ContractProgram {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.nextLine());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Enter number of installments: ");
        int installments = sc.nextInt();

        for (int i = 0; i > installments; i++){
            System.out.println("Installments: ");
            System.out.println(contract.getDate() + " - " + installments);
        }


        /*
        * Enter contract data
        Number: 8028
        Date (dd/MM/yyyy): 25/06/2018
        Contract value: 600.00
        Enter number of installments: 3
        Installments:
        25/07/2018 - 206.04
        25/08/2018 - 208.08
        25/09/2018 - 210.12
        * */



        sc.close();
    }
}
