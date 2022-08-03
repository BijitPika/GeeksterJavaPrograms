public class DuplicateElements {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 4, 5, 6, 6, 7, 7 };
        for (int i = 0; i < a.length-1; i++)
             {
                if (a[i] == a[i+1]) {
                    System.out.print(a[i]+" ");
                }
             }
    }
}



