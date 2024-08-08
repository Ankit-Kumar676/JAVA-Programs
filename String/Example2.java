public class Example2 {
    public static void main(String[] args) {
        String s = "WooHoo";
        String s1 = "HelloThere";
        String s3 = "abcdef";
        int c = s.indexOf('W');
        int c1 = s1.indexOf('H');
        int c2 = s3.indexOf('a');
        System.out.println(s.substring(c,3));
        System.out.println(s1.substring(c1,5));
        System.out.println(s3.substring(c2,3));
    }
}
