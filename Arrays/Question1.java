import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size OF ARRAY");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the " + i + " Elements");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];        
        }
            System.out.print(sum);
        }
}
