import java.util.Scanner;
public class countdigit {
    public static int count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your aaukad ka number");
        int n=sc.nextInt();
        
        System.out.print("Your aukaad is: " + count(n));
    }
}
