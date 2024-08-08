public class palindrome {
    public static void main(String[] args) {
        int n=1234;
        int rev=0;
        int n1=n;
        while(n!=0){
            int temp=n%10;
            rev=(rev)*10+temp;
            n=n/10;
        }
        if(n1==rev){
            System.out.println(rev + " It is a palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
