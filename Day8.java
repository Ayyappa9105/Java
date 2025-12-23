class Day8{
    int x=10;//class
    public static void main(String args[]){
        int x=9; //Local
        int y=7;
        System.out.println("In side main Local X value is "+x);
        value();
        System.out.println(value(x,y));
    }
    static void value(){
        int x=20;
        System.out.println("Inside value method Local X value is "+x);
    }
    static int value(int x,int y){
        return x+y;
    }
}
