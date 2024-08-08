import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Take a Number: ");
            int n = sc.nextInt();
            int n1=n;
            int n2=n;
            int sum=0;
            int count=0;
            while(n!=0){
                count++;
                n=n/10;
            }
            while(n1!=0){
                int power=1;
                int temp=n1%10;
                for(int i=1;i<=count;i++){
                power=power*temp;
            }
                sum= sum + power;
                n1=n1/10;
            }
            if(sum==n2){
                System.out.println("It is a Armstrong No.");
            }
            else
            System.out.println("NOT a ArmStrong No.");
            
    }
}
