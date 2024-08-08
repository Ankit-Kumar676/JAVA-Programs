public class characterpalindrome {
    public static void main(String[] args) {
        char a[]={'n','a','m','a','n'};
        int start=0;
        int end=a.length-1;
        boolean flag=true;
        while(start<=end){
            if(a[start]!=a[end]){
                flag=false;
                break;
            }
            start++;
            end--;
        }  
        if(flag==true){
            System.out.println("Its a Palindrome");
        }
        else
        System.out.println("Its not a Palindrome");
    }
}
