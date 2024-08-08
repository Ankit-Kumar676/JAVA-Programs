public class tolowercase {
    public static void main(String[] args) {
        String s = "JAVA IS BEST";
        System.out.println("UPPERCASE STRING IS : " + s);
        char c[] = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='A' && c[i]<='Z'){
                c[i] = (char) (s.charAt(i) + 32);
            }
        }
        System.out.print("LOWERCASE STRING IS : ");
        String s1 = new String();
        System.out.println(c);
    }
}
