import java.util.*;
class Array2D{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix size:");
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        System.out.println("enter Elemnets:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("the Matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 System.out.print(mat[i][j]);
                 System.out.print("\t");
                 
            }
            System.out.println();
        }


        
    }}