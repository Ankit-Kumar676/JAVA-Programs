import  java.util.Scanner;
public class assing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=sc.nextInt();
        double a[]=new double[n];
        for(int i=0;i<a.length;i++){
        System.out.println("enter the " + i + " elements");
            a[i]=sc.nextDouble();
        }
        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ");
        }
        }
}
