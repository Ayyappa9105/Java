import java.util.*;

class Work3 {

    public static void ci() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount:");
        int amount = sc.nextInt();

        System.out.println("Enter the interest rate:");
        double rate = sc.nextDouble();

        System.out.println("Enter the number of years:");
        double years = sc.nextDouble();

        double total = amount * Math.pow(1 + rate / 100, years);
        double ci = total - amount;

        System.out.printf(
            "Principal: %d rs\nRate: %.2f%%\nYears: %.1f\nCompound Interest: %.2f rs\n",
            amount, rate, years, ci
        );
    }

    public static void signup() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        if (!name.isEmpty()) {

            System.out.println("The length of the name is " + name.length());
            System.out.println(name.toUpperCase());
            System.out.println(name.toLowerCase());

            if (name.contains(" ")) {
                System.out.println("First name: " + name.substring(0, name.indexOf(" ")));
            } else {
                System.out.println("First name: " + name);
            }

            System.out.println("Enter your password:");
            String password = sc.nextLine();

            System.out.println("Re-enter your password:");
            String pass = sc.nextLine();

            if (password.equals(pass)) {
                System.out.println("Signup Successful ✅");
            } else {
                System.out.println("Password mismatch ❌");
            }

        } else {
            System.out.println("Name cannot be empty ❌");
        }
    }
}

class Day3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'ci' to calculate compound interest or 'signup':");
        String op = sc.nextLine();

        if (op.equals("ci")) {
            Work3.ci();
        } else if (op.equals("signup")) {
            Work3.signup();
        } else {
            System.out.println("Invalid option");
        }
    }
}
