import java.util.Scanner;

class Day1 {
    public static void main(String args[]) {
        
        // variables
        String name;
        int age;
        boolean isStudent;
        String item;
        double cost;
        double bill;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Are you a student? (true/false):");
        isStudent = sc.nextBoolean();

        sc.nextLine(); // 🔥 consume leftover newline

        System.out.println("Enter item name:");
        item = sc.nextLine();

        System.out.println("Enter cost of one item:");
        cost = sc.nextDouble();

        System.out.println("Enter number of items:");
        int items = sc.nextInt();

        double total = cost * items;

        if (isStudent) {
            bill = total - (total * 0.2); // 20% discount
        } else {
            bill = total;
        }

        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);
        System.out.println("Item Ordered: " + item);
        System.out.println("Number of Items: " + items);
        System.out.println("Total Bill: $" + bill);

        sc.close();
    }
}
