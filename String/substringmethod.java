public class substringmethod {
    public static void main(String[] args) {
        String s ="java is like a recipe it's easy to learn but it takes years tto master";
        char c = 'l';
        String temp = "";
        boolean flag = false;
        for(int i=0;i<s.length();i++){
            if(c == s.charAt(i)){
                flag = true;
            }
            if(flag==true){
                temp = temp+s.charAt(i);
            }
        }
        System.out.println(s.indexOf('l',1) + "th Position of character");
        // System.out.println(temp);
        System.out.println(s.substring(s.indexOf('l',8)));

    }
}