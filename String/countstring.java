public class countstring {
    public static void main(String[] args) {
        String s = "java is best";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 0;
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                System.out.println("It is Lower Case ");
                count++;
            }
            else{
                System.out.println("It is a special Character");
            }
        }
    }
}
