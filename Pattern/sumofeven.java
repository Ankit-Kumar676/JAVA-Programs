import java.util.Scanner;
public class sumofeven {
    public static int p1(int n){
        int count=0;
        if(n%2==0)
        while(n!=0){
            n=n%10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=123456;
        if(n%2==0){
            System.out.println((n)+(p1(n)));
        }
    }
}
