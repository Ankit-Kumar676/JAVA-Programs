public class armstrong {
    public static int count(int n) {
        int count=0;
        while(n!=0){
         count++;
         n=n/10;
        }
        return count;
    }
    public static void powersum(int n){
        int sum=0;
        int n1=n;
        int n2=n;
        while(n1!=0){
            int power=1;
            int temp=n1%10;
        for(int i=1;i<=count(n);i++){
            power=power*temp;
            
        }
        sum=sum+power;
        n1=n1/10;
    }
    if(sum==n2)
    System.out.println("arm strong number");
    else
    System.out.println("not a arm strong number");

        
    }
    public static void main(String[] args) {
       int n=153;
       powersum(n);
    }
}
