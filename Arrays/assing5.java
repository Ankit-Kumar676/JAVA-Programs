import java.util.Scanner;
public class assing5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<a.length;i++){
        System.out.println("enter the " + i + " elements");
            a[i]=sc.nextLong();
        }
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");
        }
        }
}
