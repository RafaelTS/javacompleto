package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConsumerProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

    }
}
