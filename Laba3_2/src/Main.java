public class Main {
    public static void main(String[] args) {
        double total = 0.0D;
        Rouse ros1 = new Rouse(36.5D, Flower.Color.Red);
        Rouse ros2 = new Rouse(20.0D, Flower.Color.Green);
        Violet vio1 = new Violet(55.56D, Flower.Color.Yellow);
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(ros1).addFlower(ros2).addFlower(vio1);
        System.out.println("Total price : " + bouquet.getPrice());
    }
}
