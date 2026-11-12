package ud3.productes;

public class CistellaProduct {
    private Product product;
    private int quantity;

    public CistellaProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;

    }
}
