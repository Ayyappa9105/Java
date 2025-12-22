import java.util.*;

class Day6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n value: ");
        int n = sc.nextInt();

        System.out.print("Enter the stop value: ");
        int st = sc.nextInt();

        System.out.printf("Even Numbers up to %d stop at %d%n", n, st);
        for (int i = 0; i < n; i += 2) {
            if (i > st) {
                break;
            }
            System.out.println(i);
        }

        System.out.printf("Odd Numbers up to %d skipping at %d%n", n, st);
        for (int i = 1; i < n; i += 2) {
            if (i == st) {
                continue;
            }
            System.out.println(i);
        }
    }
}
