package Diceman;

import java.util.Random;

public class Diceman  {
    private String side; // "Heads" eller "Tails"
    private Random random;

    // Constructor
    public Diceman() {
        this.random = new Random();
        this.side = "Heads"; // default
    }

    // Metode til at kaste mønten
    public void flip() {
        int result = random.nextInt(2); // 0 eller 1
        side = (result == 0) ? "Heads" : "Tails";
    }

    // Getter for side
    public String getSide() {
        return side;
    }

    @Override
    public String toString() {
        return side;
    }
}




}
