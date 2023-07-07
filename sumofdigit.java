public class sumofdigit {
    public static void main(String[] args) {
        String s = "a5b5c5d4";
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='0' && c<='9'){
                sum+=(c-'0');
            }
        }
        System.out.println(sum);
    }
}
