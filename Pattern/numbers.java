import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Factor of ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("Factors are " + i);
            }
        }
    }
}
