public class question1 {
    public static void main(String[] args) {
        int n = 153;
        int c = 0;
        int n1 = n;
        int n2=n;
        int sum=0;
        while(n!=0){
            c++;
            n=n/10;
        }
        while(n1!=0){
            int power = 1;
            int temp = n1%10;
            for(int i=0;i<c;i++){
                power = power*temp;
            }
            sum = sum + power;
            n1 = n1/10;
        }
        if(n2==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not a Armstrong");
        }
    }
    
}