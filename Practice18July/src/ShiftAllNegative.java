import java.util.Arrays;

public class ShiftAllNegative {
    public static void main(String[] args) {
        int a[] = {-1, -2, 4, 5, 6, -5};
        int b[] = new int[a.length];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[j] = a[i];
                j++;
            }


        } for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                b[j] = a[i];
                j++;
            }
        }
        a = b;
        System.out.print(Arrays.toString(b));
    }
}
