public class Stringpalindrome {
    public static void main(String[] args) {
        System.out.println(ispalindrome("madam"));
    }
    static boolean ispalindrome(String s){
        char[] a = s.toCharArray();
        int i = 0, j =a.length-1;
        while(i<j){
            if(a[i]!=a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
