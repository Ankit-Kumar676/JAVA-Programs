public class longestword {
    public static void main(String[] args) {
        String s = "hello this is strings";
        String c = "";
        String arr[] = s.split(" ");
        int count = Integer.MIN_VALUE;
        String maxString = null;
        for(String i:arr){
            if(count<i.length()){
                count = i.length();
                maxString = i;
            }
        }
        System.out.println(maxString);
    }
}
