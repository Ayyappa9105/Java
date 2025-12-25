import java.util.*;

class Dice {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int roll;
        int total = 0;

        System.out.print("Enter number of dice rolls: ");
        roll = sc.nextInt();

        if (roll > 0) {
            for (int i = 0; i < roll; i++) {
                int dice = r.nextInt(6) + 1;
                System.out.println("\nDice rolled: " + dice);
                rolldice(dice);
                total += dice;
            }
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("Total so far: " + total);
    }

    static void rolldice(int dice) {

        String dice1 = """
         --------
        |        |
        |    o   |
        |        |
         --------
        """;

        String dice2 = """
         --------
        |  o     |
        |        |
        |      o |
         --------
        """;

        String dice3 = """
         --------
        | o      |
        |   o    |
        |      o |
         --------
        """;

        String dice4 = """
         --------
        | o    o |
        |        |
        | o    o |
         --------
        """;

        String dice5 = """
         --------
        | o    o |
        |   o    |
        | o    o |
         --------
        """;

        String dice6 = """
         --------
        | o    o |
        | o    o |
        | o    o |
         --------
        """;

        switch (dice) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
