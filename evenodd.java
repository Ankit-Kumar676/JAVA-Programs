import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        String result = a%2==0 ? "even" : "odd";
        System.out.println(result);
    }
    
}
