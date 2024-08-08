public class binarysearch {
    public static void main(String[] args) {
        int a[]={1,4,5,2,3,6,7,8,9,11,10};
        int start=a[0];
        int end=a.length-1;
        int n=10;
                for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a){
            System.out.print(i +" ");
        }
        System.out.println();
        boolean flag=false;
        while(start<=end){
            int middle=(start+end)/2;
            //System.out.print(a[middle] +" ");
            
            if(a[middle]==n){
                System.out.println(n+" number found in "+middle+" th position");
                flag=true;
                break;
            }
            else if(a[middle]<n){
                start=middle + 1;
            }
            else {
                  end=middle - 1;
            }
        }
        if(flag==false)
        System.out.print("Not found");
        }
}

