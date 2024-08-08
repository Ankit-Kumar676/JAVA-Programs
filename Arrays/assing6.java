import java.util.Scanner;
public class assing6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        float a[]=new float[n];
        for(int i=0;i<a.length;i++){
        System.out.println("enter the " + i + " elements");
            a[i]=sc.nextFloat();
        }
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");
        }
        }
}
