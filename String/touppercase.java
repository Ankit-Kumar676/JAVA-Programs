public class touppercase {
    public static void main(String[] args) {
        String s = "java is best";
        System.out.println("LOWER CASE STRING IS : " + s);
        char c []= s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a' && c[i]<='z'){
                c[i] = (char) (s.charAt(i)-32);
            }
        }
        System.out.print("UPPERCASE STRING IS : ");
       String s1 = new String(c);
       System.out.println(s1);
    }
}
