import java.util.Scanner;

public class reversemerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Old ARRAY");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("NEW ARRAY and REVERSED");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
