public class Ifsorted {
    public static void main(String[] args) {
        int a[]={1,2,3,5,6};

        boolean IfSorted=false;

        for(int i=0;i<a.length-1;i++)
        {
            IfSorted= a[i] < a[i + 1];

        }
        System.out.println(IfSorted);
    }
}

