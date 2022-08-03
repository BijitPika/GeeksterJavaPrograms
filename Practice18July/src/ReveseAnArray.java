import java.util.Arrays;

public class ReveseAnArray {
    public static void main(String[] args) {
        int a[] = {1, 4, 2, 6, 3, 7};
        int n = a.length;
        int i = 0;
        int j = a.length - 1;
        while (i < j) {

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }


        System.out.println(Arrays.toString(a));
    }
}

