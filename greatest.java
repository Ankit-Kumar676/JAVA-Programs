import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int a = sc.nextInt();
        System.out.println("Enter the value");
        int b = sc.nextInt();
        String result = (a>b ? "a is greatest" : "b is greatest");
        System.out.println(result);
    }
}
