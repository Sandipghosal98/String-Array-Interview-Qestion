public class anagramString {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        System.out.println(anagram(s1,s2));
    }
   private static boolean anagram(String s1, String s2) {
        while (true) {
            if(s1.length()!=s2.length()) return false;
            else if(s1.length()==0 && s2.length()==0) return true;
            char c = s1.charAt(0);
            s1 = s1.replace(c+"", "");
            s2 = s2.replace(c+"","");
        }
    }
}
