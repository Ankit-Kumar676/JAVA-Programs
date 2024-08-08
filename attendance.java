import java.util.Scanner;
public class attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total Number of classes attended");
        float a = sc.nextFloat();

        System.out.println("Total number of classes held");
        float b = sc.nextFloat();

        if(a/b*100>75){
            System.out.println("You are allowed to sit in the examination with "+a/b*100 + " percentage of attendance");
        }else{
            System.out.println("You are not allowed to sit in examination with "+a/b*100 +" percentage of attendance");
        }
    }
    
}
