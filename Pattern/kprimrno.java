import java.util.Scanner;
public class kprimrno {
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
    System.out.println("enter the start");
    int n=sc.nextInt();
    System.out.println("enter the k number");
    int k=sc.nextInt();
    int count=0;
    for(int i=1;i<=n;i++){
        boolean result=prime(i);
        if(result){
            count++;
            if(count==k){
            System.out.println(i);
            break;
        }
        }
    }
}
}