import java.util.Scanner;
public class check3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        float a = sc.nextFloat();
        System.out.println("Enter Bredth");
        float b = sc.nextFloat();
        if(a!=b){
            System.out.println("It is a Rectangle");
        }else{
            System.out.println("It is a Square");
        }
    }
    
}
