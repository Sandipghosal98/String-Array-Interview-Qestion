public class countString {
    public static void main(String[] args) {
        String s = "hanuman@123$3=";
        int alphabetcount = 0;
        int numbercount = 0;
        int specialcount = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            alphabetcount++;
            else if(ch>='0' && ch<='9')
            numbercount++;
            else 
            specialcount++;
        }
        System.out.println("Alphabets==> "+alphabetcount);
        System.out.println("Numbercount==>"+ numbercount);
        System.out.println("Specialcount==>"+specialcount);
    }
}
