import java.util.Random;
class Day2{
    public static void main(String[] args) {
        //Flip A Coin
        boolean toss;
        Random r=new Random();
        toss=r.nextBoolean();
        if(toss){
            System.out.print("Heads");
        }
        else{
            System.out.println("Tails");
        }

    }
}