package Diceman;

    public class DicemanTest {
        public static void main(String[] args) {
            Diceman myDice = new Diceman();
            int DiceCount = 0;
            int totalRolls = 0;


            while (DiceCount < 6) {
                myDice.Roll();
                totalRolls++;
                System.out.println("Roll " + totalRolls + ": " + myDice);


                switch (myDice.getDice()) {
                    case "":
                        DiceCount++;
                        break;
                    case "":
                        DiceCount++;
                        break;
                    default:
                        System.out.println("Unknown result!");
                }
            }


            System.out.println("\nFinished!");
            System.out.println("Total Rolls: " + totalRolls);
            System.out.println("Dice Count: " + DiceCount);
        }
}
