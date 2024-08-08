public class power {
    public static int power(int base,int power){
        int result=1;
        for(int i=1;i<=power;i++){
            result*=base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Result is: " + power(7,3));
    }
}
