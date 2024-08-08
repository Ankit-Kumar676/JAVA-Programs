public class techno {
    public static void main(String[] args) {
        int n=2026;
        int count=0 , sum=0 ,n1=n,n2=n;
        while(n!=0){
            count++;
            n=n/10;
        }
        if(count%2==0){
            int f=power.power(10,count/2);
            int firstpart=n1/f;
            int secondpart=n1%f;
            sum=firstpart+secondpart;
            int total=sum*sum;
            if(total==n2){
                System.out.println("It is a Tech");
            }
            else{
                System.out.println("it is not a tech");
            }
        }
        else{
            System.out.println("It is not a even & tech no.");
        }
    }
}

