public class question4 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<=n;i++){
            for(int k=1;k<n+1;k++){
                System.out.println("  ");
            }
            for(int j=1;j<=i;j++){
                if(i==1 && j==5 && j==1){

                    System.out.print("*  ");
                }
            }
        }
        System.out.println();
        for(int i=n;i<=n-1;i--){
            for(int k=1;k<n-i;k++){
                System.out.println("  ");
            }
            for(int j=1;j<=i;j++){
                if(j==5 && i==1 && j==5){

                    System.out.print("*  ");
                }
            }
        }
        System.out.println();
    }
}
