package br.sc.rafael.secao20.application;

import br.sc.rafael.secao20.entities.MyFunctionProduct;
import br.sc.rafael.secao20.entities.Product;
import br.sc.rafael.secao20.services.MyFunctionProductService;
import br.sc.rafael.secao20.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*Start Predicate*/
        //I did this predicate for example
        list.removeIf(new ProductPredicate());

        for (Product product : list) {
            System.out.println(product);
        }
        /*end Predicate*/




        /*Start myFunction (a function who reads another one)*/
        MyFunctionProductService ps = new MyFunctionProductService();

        double sum  = ps.filteredSum(list, p ->p.getName().charAt(0) == 'M');
        double sum2 = ps.filteredSum(list, p ->p.getPrice() < 100.0);
      //  System.out.println("Sum = " + String.format("%.2f", sum));
        /*end myFunction*/
    }
}
