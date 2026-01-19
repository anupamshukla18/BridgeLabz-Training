package com.generics.marketplace;
import java.util.ArrayList;
import java.util.List;

class ProductCatalog {

    private List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product<? extends Category> p : products) {
            System.out.println(
                p.getCategory().getCategoryName() + " - " +
                p.getName() + " : ₹" + p.getPrice()
            );
        }
    }
}
