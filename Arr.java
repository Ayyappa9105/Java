import java.util.*;

class Arr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] groceries = new String[n];
        String[] weights = new String[n];

        System.out.println("Enter groceries with weights (example: rice 25kg):");

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();  
            String[] parts = input.split(" "); 

            groceries[i] = parts[0];
            weights[i] = parts[1];
        }

        System.out.println("Groceries are:");
        for (int i = 0; i < n; i++) {
            System.out.println(groceries[i] + "  " + weights[i]);
        }
    }
}
