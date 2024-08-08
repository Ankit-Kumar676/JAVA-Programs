public class stringtoarray {
    public static void main(String[] args) {
        String s = "Hello";
        char c[] = s.toCharArray();
        for(int i=0;i<c.length-1;i++){
            c[i] = s.charAt(i);
        }
        for(char C:c){
            System.out.println(c);
        }
    }
}
