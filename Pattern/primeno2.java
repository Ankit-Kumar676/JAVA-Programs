import java.util.Scanner;

public class primeno2 {
    public static boolean prime(int n){
        int a=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            a++;
        }
        if(a==2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //int n=sc.nextInt();
        // int x=sc.nextInt();
        System.out.println("Start From ");
        int start=sc.nextInt();
        System.out.println("End At ");
        int end=sc.nextInt();
        for(int n=start;n<=end;n++){
            boolean res = prime(n);
            if(res){
                System.out.println(n);
            }
        }
    }
}
