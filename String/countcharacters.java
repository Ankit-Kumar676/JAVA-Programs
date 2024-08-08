public class countcharacters {
    public static void main(String[] args) {
        String s = "this is my java programming";
        int vowel = 0;
        int consonant = 0;
        int sp = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                vowel++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                consonant++;
            }
            else{
                sp++;
            }
        }
        System.out.println("number of vowels : " + vowel);
        System.out.println("number of consonants : " + consonant);
        System.out.println("number of special characters : " + sp);
    }

}
