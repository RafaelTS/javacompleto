package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PredicateProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //I did this predicate for example creating a class
        //list.removeIf(new ProductPredicate());

        //Using Method Reference
        //list.removeIf(Product::staticProductPredicate);
        //Using nonStaticMethod
        //list.removeIf(Product::nonStaticProductPredicate);

        /*using lambda expression
        Predicate<Product> predicate = product -> product.getPrice() >= 100;

        list.removeIf(predicate);
        */
        //Using lambda inline Expression
        list.removeIf(product -> product.getPrice() >= 100);

//        for (Product product : list) {
//            System.out.println(product);
//        }
        list.stream().forEach(product -> System.out.println(product));

    }

}
