public class Snail {
    private String color;
    private int distance;

    public Snail(String color) {
        this.color = color;
        this.distance = 0;
    }

    public String getColor() {
        return color;
    }

    public int getDistance() {
        return distance;
    }

    public void race(boolean hasBoost) {
        int move = (int) (Math.random() * 4); 
        if (hasBoost) {
            move *= 2;
        }
        distance += move;
    }
}
