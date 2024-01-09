import java.util.Scanner;

public class productnumber {
    public static int calculateproduct(int a, int b){
         a*b;
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("calculate of two number product: " +calculateproduct(a, b));
    }
}
