import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private double price;
    public List<Flower> flowers = new ArrayList();

    public double getPrice() {
        return this.price;
    }

    public Bouquet addFlower(Flower flower) {
        this.flowers.add(flower);
        this.price += flower.getPrice();
        return this;
    }
}
