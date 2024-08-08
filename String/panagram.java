public class panagram {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        boolean[] a = new boolean[26];
      int index = 0;
      int flag = 1;
      for (int i = 0; i < s.length(); i++) {
         if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            index = s.charAt(i) - 'A';
         }else if( s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
            index = s.charAt(i) - 'a';
      }
      a[index] = true;
   }
   for (int i = 0; i <= 25; i++) {
      if (a[i] == false)
      flag = 0;
   }
   System.out.print("String: " + s + " - ");
   if (flag == 1)
      System.out.print(" The above string is a pangram.");
   else
      System.out.print("The above string is not a pangram.");
        
    }
}
