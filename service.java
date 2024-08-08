import java.util.Scanner;
public class service {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Experience");
        int exp = sc.nextInt();
        int sal = 10000;
        if(exp>5){
            float b =(sal*exp)/100;
            System.out.println(b +" Bonus");
        }else{
            System.out.println("No Bonus");
        }

    }
}
