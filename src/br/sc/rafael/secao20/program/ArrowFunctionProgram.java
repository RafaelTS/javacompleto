package br.sc.rafael.secao20.program;

import br.sc.rafael.secao20.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrowFunctionProgram {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //my arrow function or something like below
        //Comparator<Product> comp = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());

        list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Product product : list){
            System.out.println(product);
        }

    }
}
