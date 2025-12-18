import java.util.Scanner;

class Day4 {

    static class User {

        static Scanner sc = new Scanner(System.in);

        public static void login(String name, String pass) {

            if (name.equals("Ayyappa9105")) {
                if (pass.equals("11223344")) {
                    System.out.println("Login successful ✅");
                } else {
                    System.out.println("Password wrong ❌");
                }
            } else {
                System.out.println("User not found ❌");
            }
        }

        public static void signup() {

            System.out.println("Enter your name:");
            String name = sc.nextLine();

            System.out.println("Enter your password:");
            String password = sc.nextLine();

            System.out.println("Re-enter your password:");
            String confirm = sc.nextLine();

            if (password.equals(confirm)) {
                System.out.println("Signup successful ✅");
            } else {
                System.out.println("Passwords do not match ❌");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. 'Signup' 2. 'Login' ");
        int choice = sc.nextInt();
        sc.nextLine(); 
        switch(choice){
            case 1 -> User.signup();
            case 2 ->{ System.out.println("USERNAME:");
                      String u=sc.nextLine();
                      System.out.println("PASSWORD:");
                      String p=sc.nextLine();
                      User.login(u,p); 
                    }
            default -> System.out.println("Invalid choice");
        }
    }
}
