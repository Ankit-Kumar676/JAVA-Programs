import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Value");
        int a = sc.nextInt();
        if(a%6==0){
            System.out.println("It is Divisible by 6");
        }else{
            System.out.println("It is not Divisible  by 6");
        }
    }
    
}
