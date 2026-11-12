package ud3.productes;

import java.util.*;

public class CistellaCompra {
    private final User user;
    private final Map<Product, CistellaProduct> products;

    public CistellaCompra(User user) {
        this.user = user;
        this.products = new HashMap<>();
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Map.Entry<Product, CistellaProduct> entry : products.entrySet()) {
            totalPrice += entry.getKey().getPrice() * entry.getValue().getQuantity();
        }
        return totalPrice;
    }

    public void addProduct(Product p){
        if (products.containsKey(p)) {
            int quantity = products.get(p).getQuantity();
            products.get(p).setQuantity(quantity + 1);
        } else {
            CistellaProduct newCistellaProduct = new CistellaProduct(1);
            products.put(p, newCistellaProduct);
        }
    }
}
