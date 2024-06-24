import java.util.Scanner;
public class Add{
    public static void main(String[] args){
        System.out.println("enter values: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("sum="+(a+b));
        sc.close();
    }
}