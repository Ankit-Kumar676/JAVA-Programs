public class pracrtice {
    public static void main(String[] args) {
        int n=5;
        char a ='A';
        char c ='a';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(a%2==0)
                System.out.print(a+ " ");
                else
                System.out.print(c + " ");
            }
            c++;
            a++;
            System.out.println();
        }
    }
}
