import java.util.Scanner;
public class check2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the alphabet");
        char a =sc.next().charAt(0);
        if(a>'A' && a<'Z' || a>'a' && a<'z'){
            System.out.println(a + " is an Uppercase");
        }else{
            System.out.println(a + " is Lowercase");
        }

}
    
}
