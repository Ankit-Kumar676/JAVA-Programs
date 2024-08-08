public class removespace {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("original sentence : " + s);
        String sc = s.replaceAll("//s", "");
        System.out.println("replacement : " + sc);
    }
}
