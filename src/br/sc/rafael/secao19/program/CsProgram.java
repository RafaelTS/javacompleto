package br.sc.rafael.secao19.program;

import br.sc.rafael.secao19.entities.Product;
import br.sc.rafael.secao19.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsProgram {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        //linux
        String path = "/home/rateixeira/in.txt";
        //windows
        //String path = "C:\\temp\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Most Expensive: ");
            System.out.println(x);

        } catch (IOException | IllegalAccessException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}
