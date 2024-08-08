public class Examplesubstring {
    public static void main(String[] args) {
        String s ="qspiders@yahoo.com";
        int index = s.indexOf('q');
        int last = s.indexOf('s');
        int domain = s.indexOf('@')+1;
        System.out.println(s.substring(0 , 8));
        System.out.println(s.substring(9, 14));
    }
}
