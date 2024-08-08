import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is bigger in age");
        }else if(b>a && b>c){
            System.out.println("b is bigger in age");
        }else if(c>a && c>b){
            System.out.println("c is bigger in age");
        }else{
            System.out.println("Everyoe is of same age");
        }
    }
    
}