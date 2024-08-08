import java.util.Scanner;
public class assing4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        short a[]=new short[n];
        for(int i=0;i<a.length;i++){
        System.out.println("enter the " + i + " elements");
            a[i]=sc.nextShort();
        }
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");
        }
        }
}
