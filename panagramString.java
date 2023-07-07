public class panagramString {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over a lazy dog";
        if(ispalindrome(s))
        System.out.println("Panagram");
        else
        System.out.println("Not Panagram");
    }
    static boolean ispalindrome(String s){
        for(char c='a';c<='z';c++){
            if(s.indexOf(c)==-1)return false;
        }
        return true;
    }
}
