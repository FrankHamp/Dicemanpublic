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
                    case 1:
                        DiceCount++;
                        break;
                    case 2:
                        DiceCount++;
                        break;
                    case 3:
                        DiceCount++;
                        break;
                    case 4:
                        DiceCount++;
                        break;
                    case 5:
                        DiceCount++;
                        break;
                    case 6:
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
