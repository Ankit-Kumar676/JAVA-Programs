import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        System.out.println("Enter the Character");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int asciiValue = c;
        System.out.println("Ascii value of" +c+ "is:" + asciiValue);
    }
}
