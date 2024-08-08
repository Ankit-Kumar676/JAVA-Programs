import java.util.Scanner;

public class mergearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int k=0;
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the a" +i+" elements");
            a[i]=sc.nextInt();
            c[k++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the b" +i + " elements");
            b[i]=sc.nextInt();
            c[k++]=b[i];
        }
        for(int i=0;i<(a.length+b.length);i++){
            System.out.print(c[i]+" ");
        }
    }
}
