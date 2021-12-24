package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.Product;
import br.sc.rafael.secao20.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerProgram {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Interface
        //list.forEach(new PriceUpdate());

        //static Reference Method
       // list.forEach(Product::staticPriceUpdate);

        //non static Reference Method
        //list.forEach(Product::nonStaticPriceUpdate);

        //lambda expression
//        Consumer<Product> consumer = product -> {
//            product.setPrice(product.getPrice() * 1.1);
//        };
//
//        list.forEach(consumer);

        //lambda expression inline

        list.forEach(product -> {
            product.setPrice(product.getPrice() * 1.1);
        });
        
        list.forEach(System.out::println);

        for (Product product : list){
            System.out.println(product);
        }
    }
}
