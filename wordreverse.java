public class wordreverse {
    public static void main(String[] args) {
        String s1 = "java is easy";
        String s2 = " ";
        String[] a = s1.split(" ");
        for(int i=a.length-1;i>=0;i--){
            s2+=a[i];
            s2+=" ";
        }
        s2=s2.trim();
        System.out.println(s2);
    }
}
