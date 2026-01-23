import java.util.Random;
import java.util.Scanner;

class RPS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] choice = {"rock", "paper", "scissor"};
        boolean st = true;

        do {
            System.out.print("Your choice (rock/paper/scissor or exit): ");
            String sel = sc.nextLine().toLowerCase();

            if (sel.equals("exit")) {
                st = false;
                break;
            }

            int compIndex = r.nextInt(3);
            String compChoice = choice[compIndex];

            System.out.println("Computer choice: " + compChoice);

            if (sel.equals(compChoice)) {
                System.out.println("Tie");
            }
            else if (
                (sel.equals("rock") && compChoice.equals("scissor")) ||
                (sel.equals("paper") && compChoice.equals("rock")) ||
                (sel.equals("scissor") && compChoice.equals("paper"))
            ) {
                System.out.println("You Win 🎉");
            }
            else if (
                sel.equals("rock") || sel.equals("paper") || sel.equals("scissor")
            ) {
                System.out.println("You Lose 😢");
            }
            else {
                System.out.println("Invalid input!");
            }

            System.out.println();

        } while (st);

        sc.close();
    }
}
