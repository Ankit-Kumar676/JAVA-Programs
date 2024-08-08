public class removeduplicate {
    public static void main(String[] args) {
        String s = "hello world hello";
        char c1[] = s.toCharArray();
        char c2[] = s.toCharArray();
        for(int i=0;i<c1.length;i++){
            char c = c1[i];
            for(int j=i;j<c1.length;j++){
                if(c == c2[j]){
                    c2[j]='/';
                }
            }
        }
    }
}
