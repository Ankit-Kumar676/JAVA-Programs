public class copyarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println("Elements of ariginal array");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Elements of new array");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i] + " ");
        }
    }
}
