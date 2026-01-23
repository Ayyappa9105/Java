import java.util.*;

class SlotMac {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] symbols = {"🍒", "🍋", "⭐"};
        int choice;

        System.out.print("Enter starting amount: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        do {
            if (amount <= 0) {
                System.out.println("No balance left. Game over!");
                break;
            }

            String s1 = symbols[r.nextInt(symbols.length)];
            String s2 = symbols[r.nextInt(symbols.length)];
            String s3 = symbols[r.nextInt(symbols.length)];

            System.out.println("\n🎰 Slot Result 🎰");
            System.out.println(" " + s1 + " | " + s2 + " | " + s3);

            if (s1.equals(s2) && s2.equals(s3)) {
                amount += 50;
                System.out.println("🎉 JACKPOT! You WIN +50");
            } else {
                amount -= 10;
                System.out.println("😢 You LOSE -10");
            }

            System.out.println("Current Balance: " + amount);

            System.out.print("Play again? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Thanks for playing 🎰");
        sc.close();
    }
}
