package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.Product;
import br.sc.rafael.secao20.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Interface implementation
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        //Static Reference Method
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //NonStatic Reference Method
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //Lambda Expression
        //Function<Product, String> function = product -> product.getName().toUpperCase();
        //List<String> names = list.stream().map(function).collect(Collectors.toList());

        //Lambda Expression inLine
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);

    }
}
