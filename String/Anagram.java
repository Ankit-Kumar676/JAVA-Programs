public class Anagram {
    public static String sort(char[] c) {
        for(int i=0;i<c.length-1;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i]>c[j]){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
            }
        }
        return new String(c);
    }
public static void main(String[] args) {
    String s1 = "Listen";
    String s2="Silent";
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char c1[] = s1.toCharArray();
    char c2[] = s2.toCharArray();
    String s3 = sort(c1);
    String s4 = sort(c2);
    if(s3.equals(s4)){
        System.out.println("Its a Anagram");
    }
    else{
        System.out.println("Its Not a Anagram");
    }
}    
}