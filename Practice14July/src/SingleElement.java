public class SingleElement {
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,5,4,5,3};
        int n=0;
        for(int i=0;i<a.length;i++){
            System.out.println("a[i]::"+a[i]);
            n=n^a[i];
            System.out.println("XOR ::"+n);
        }
        System.out.println("Appearing only Once :"+n);

    }
}
