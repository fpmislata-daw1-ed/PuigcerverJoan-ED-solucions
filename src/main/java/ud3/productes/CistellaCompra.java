package ud3.productes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CistellaCompra {
    private final User user;
    private final List<CistellaProduct> products;

    public CistellaCompra(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public double getTotalPrice(){
        return products.stream()
                .mapToDouble(
                        p -> p.getQuantity() * p.getProduct().getPrice()
                ).sum();
    }

    public void addProduct(Product p){
        Optional<CistellaProduct> cistellaProduct = products.stream()
                .filter(cp -> cp.getProduct().equals(p))
                .findAny();

        if (cistellaProduct.isPresent()) {
            int quantity = cistellaProduct.get().getQuantity();
            cistellaProduct.get().setQuantity(quantity + 1);
        } else {
            CistellaProduct newCistellaProduct = new CistellaProduct(p, 1);
            products.add(newCistellaProduct);
        }
    }
}
