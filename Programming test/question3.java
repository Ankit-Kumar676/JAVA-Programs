import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc . nextInt();
        for(int i=1;i<=n;i++){
            int k = sc . nextInt();
            for(int j=1;j<=i;j++){
                System.out.print(k + " ");
                k++;
                if(k==1){
                    k=0;
                }
                else{
                    k=1;
                }
            }
        }
        System.out.println();
    }
}
