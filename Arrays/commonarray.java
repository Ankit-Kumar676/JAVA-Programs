public class commonarray {
    public static void main(String[] args) {
        int a[]={4,2,3,1,6};
        int b[]={6,7,9,8,4};
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[i]){
                    System.out.println();
                }
            }
        }
        System.out.println("Common Elements" + c);
    }
}
