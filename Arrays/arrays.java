import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.println("enter the " + i  +" elements");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        int b[]=new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }
        System.out.println();
        System.out.println("NEW ARRAY");
        for(int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
