public class fibonacchi {
    public static void main(String[] args) {
        int i=1;
        int n1=0;
        int n2=1;
        int n3=0;
        while(i<=10){
            System.out.print(n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
            i++;
        }
    }
}