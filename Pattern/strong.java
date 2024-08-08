public class strong {
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=5;i++){
            f=f*i;
        }
        System.out.println("Factorial" + f);
    }
    public static void main(String[] args) {
        int n=121;
        int sum=0;
        int n1=n;
        while(n!=0){
            int t=n%10;
            sum=sum+factorial(t);
            n=n/10;
        }
        if(sum==n1){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
}    
