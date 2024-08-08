public class kadane {
    public static void main(String[] args) {
        int a[]={-1,-2,3,-4,-1,7,14};
        int sum=0;
        int max = 0;
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
            if(sum<0){
                sum = 0;
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(sum);
        System.out.println(max);
    }
}
