import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        String z = scan.next();
       String a = scan.nextLine();
       int b = scan.nextInt();
       long c = scan.nextLong();
       float d = scan.nextFloat();
       double e = scan.nextDouble();
        System.out.println("Value of A is = " +a);
        System.out.println("value of B is = " +b);
        System.out.println("Valur of C = " +c);
        System.out.println("Value of D = " +d);
        System.out.println("value of E = " +e);
    }
    
}
