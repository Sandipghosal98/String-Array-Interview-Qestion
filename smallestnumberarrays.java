public class smallestnumberarrays {
    public static void main(String[] args) {
        int[] a = {4,7,2,5,9};
        System.out.println(small(a));
    }
    static int small(int[] a){
        int s = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<s) s=a[i];
        }
        return s;
    }
}
