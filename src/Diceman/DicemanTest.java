package Diceman;

public class DicemanTest {
    public static void main(String[] args) {

        Diceman dice = new Diceman();

        // Roll the dice 5 times
        for (int i = 1; i <= 5; i++) {
            dice.roll();
            System.out.println("Roll " + i + ": " + dice);
        }

        System.out.println("\nThe Dice Man is done for the day.");
    }
}
