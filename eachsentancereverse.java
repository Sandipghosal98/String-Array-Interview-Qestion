public class eachsentancereverse {
    public static void main(String[] args) {
        String s1 = "Java is easy";
        String[] a = s1.split(" ");
        String s2 = "";
        for(int i=0;i<a.length;i++){
            s2+=rev(a[i])+" ";   
        }
        s2=s2.trim();
        System.out.println(s2);
    }
    static String rev(String s){
        String s1 = " ";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
}
