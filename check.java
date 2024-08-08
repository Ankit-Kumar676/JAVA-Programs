import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        char c = sc.next().charAt(0);
        if(c>='a' && c<='z' || c>='A' && c<='Z'){
            System.out.println("This is a Alphabet");
        }else if(c>='0' && c<='9'){
            System.out.println("This is Number");
        }else{
            System.out.println("This is a Special Character");
        }
    }
    
}
