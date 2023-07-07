public class sndsmallestarray {
    public static void main(String[] args) {
        int[] a = {5,8,3,9,1};
        System.out.println(secondsmallest(a));
    }
     static int secondsmallest(int[] a){
        int s1=a[0], s2=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]==s1) continue;
            if(a[i]<s1){
                s2=s1;
                s1=a[i];
            }
            else if(a[i]<s2 || s1==s2){
                s2=a[i];
            }
        }
        return s2;
    }
}
