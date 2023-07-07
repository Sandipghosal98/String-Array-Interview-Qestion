public class removeduplicate {
    public static void main(String[] args) {
        String s = "banana";
        String temp = " ";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(temp.indexOf(ch)==-1)
            temp+=ch;
        }
        System.out.println(temp);
    }
}
