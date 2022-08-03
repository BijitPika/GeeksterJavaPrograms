import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4, 3, 5, 6, 2, 1};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }
            System.out.println(i+1+ " Pass : "+ Arrays.toString(a));

        }
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k]+" ");
        }
    }
}

