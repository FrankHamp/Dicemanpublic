package Diceman;

import java.util.Random;

public class Diceman  {
    private String dice; // "Heads" eller "Tails"
    private Random random;

    // Constructor
    public Diceman() {
        this.random = new Random();
        this.dice = "Heads"; // default
    }

    // Metode til at kaste mønten
    public void Roll() {
        int result = random.nextInt(2); // 0 eller 1
        dice = (result == 0) ? "Heads" : "Tails";
    }

    // Getter for side
    public String getDice() {
        return dice;
    }

    @Override
    public String toString() {
        return dice;
    }
}





