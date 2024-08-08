import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Size OF Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            System.out.print("enter the elements of " + i + " ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.print(i + " ");
        }
    
    }
}
