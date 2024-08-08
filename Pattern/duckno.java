public class duckno {
    public static int p4(int n){
        int count=0;
        for(int i=1;i<=n;i++){
        if(n!=0){
            count++;
            n=n%10;
        }   
    }
    return count;
}
    public static void main(String[] args) {
        int n=123450;
        if(n==0){
            System.out.println("It is a duck no");
        }
        else{
            System.out.println("it is not");
    }
    }
}
