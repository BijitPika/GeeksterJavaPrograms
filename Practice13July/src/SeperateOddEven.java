
import java.util.Arrays;

public class SeperateOddEven {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,6,7,8,9,7};
        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] % 2 == 0) {
                i++;
            }
            if (a[j] % 2 != 0) {
                j--;
            }
            if (a[i] % 2 != 0 && a[j] % 2 == 0 && i<j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}


    

