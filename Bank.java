import java.util.*;
class Bank{
   static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int choice;
        double balance=0;
        boolean isRun=true;
        while(isRun){
        System.out.printf("enter your choice \n 1.check balance \n 2.Deposite \n 3.Withdraw \n 4.Exit \n");
        choice=sc.nextInt();
        switch(choice){
            case 1-> showbalance(balance);
            case 2-> balance=deposite(balance);
            case 3-> balance=withdraw(balance);
            case 4-> isRun=false;
            default -> System.out.println("Wrong Choice");
        }
        }
        System.out.println("Thankyou Visit again!!!");
    }
    static double showbalance(double balance){
        System.out.println("Current Balance: ₹" + balance);
        return balance;
    }
    static double deposite(double balance){
        System.out.println("Enter the deposite amount");
        double amount=sc.nextDouble();
        if(amount<0){
            return 0;
        }
        else{
           return balance+=amount;
        }
    }
    static double withdraw(double balance){
        System.out.println("Enter the withdraw amount");
        double amount=sc.nextDouble();
        if(amount > balance || amount<0){
            System.out.println("Amount is within the balance");
            return balance;
        }
        else{
          return balance-=amount;
        }
    }


}