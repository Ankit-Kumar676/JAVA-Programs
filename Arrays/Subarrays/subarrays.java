public class subarrays {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int n=4;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(" " + a[k] + " ");
                    // int formulae=n*(n+1)/2;
                }
                System.out.println();
            }
        }
    }
}
