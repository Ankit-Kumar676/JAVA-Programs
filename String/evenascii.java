public class evenascii {
    public static void main(String[] args) {
        String s = "OnePiece";
        int c = s.length()-4;
        for(int i=c;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
    }
}
