import java.util.*;
class Day7{
    static void happy(String name,int age){
        System.out.println("Happy Birthday to you!!");
        System.out.println("Happy birthday to you dear"+ name);
        System.out.printf("you are %d old",age);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Birthday Boy Name:");
        String name=sc.nextLine();
        System.out.println("age:");
        int age=sc.nextInt();
        for(int i=0;i<age;i++){
            happy(name,age);
        }
        System.out.println("Square of the age is:");
        int sq=square(age);
        System.out.println(sq);
    }
    static int square(int n){
        return n*n;
    }
    }
