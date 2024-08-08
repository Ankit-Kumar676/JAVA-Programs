public class maxsumofsubarray {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                    sum = sum + a[k];
                }
                System.out.println(" == " + sum);
                if(sum > max){
                    max=sum;
                }
                System.out.println();
            }
        }
        System.out.println("Max sum of subarray : " + max);
    }
}
