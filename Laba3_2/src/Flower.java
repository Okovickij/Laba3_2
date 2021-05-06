public class Flower {
    public enum Color
    {
        Red, Yellow, Green;

    }
    private double price;
    private String name;
    private Color color;

    public Flower(double price, String name, Color color) {
        if (price < 0.0D) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        } else {
            this.price = price;
                this.name = name;
                if (color == null) {
                    throw new NullPointerException("Argument color can not be null.");
                } else {
                    this.color = color;
                }
            }
        }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public Color getColor() {
        return this.color;
    }
}
