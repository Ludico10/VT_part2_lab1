package objectClasses.Task9;

public class Basket {
    private final Ball[] balls;
    private double weight;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public double getTotalWeight() {
        for (var element : balls) {
            weight += element.getWeight();
        }
        return weight;
    }

    public int getCountOfColor(Color color) {
        int result = 0;
        for (var element : balls) {
            if (element.getColor() == color)
                result++;
        }
        return result;
    }
}
