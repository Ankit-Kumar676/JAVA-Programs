public class stringpalindrome {
    public static void main(String[] args) {
    String s ="naman";
    String rev="";
            for(int i=s.length()-1;i>=0;i--){
                rev = rev + s.charAt(i);
            }
            if(s.equals(rev)){
                System.out.print("it is a palindrome");
            }
            else
            System.out.println("It is not palindrome");
    }
}
