import java.util.*;

class Day5 {
    public static void main(String args[]) { 

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int guess = r.nextInt(100) + 1;
        int attempt = 0;
        int n;

        do {
            System.out.print("Guess the number between 1-100: ");
            n = sc.nextInt();
            attempt++;

            if (n > guess) {
                System.out.println("Too High ❌");
            } else if (n < guess) {
                System.out.println("Too Low ❌");
            }

        } while (guess != n);

        System.out.println("🎉 You Won!!! in " + attempt + " attempts");
    }
}
