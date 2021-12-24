package br.sc.rafael.secao20.util;

import br.sc.rafael.secao20.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer <Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);

    }
}
