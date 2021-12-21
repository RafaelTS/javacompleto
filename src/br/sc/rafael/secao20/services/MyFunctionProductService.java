package br.sc.rafael.secao20.services;


import br.sc.rafael.secao20.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class MyFunctionProductService {

    public  double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;

        for (Product product : list) {
            if(criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

    public double filteredSumWithListStream(List<Product> list, Predicate<Product> criteria) {
        double sum = list.stream().filter(criteria::test).mapToDouble(Product::getPrice).sum();
        return sum;
    }


}
