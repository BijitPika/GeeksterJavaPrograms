import java.util.Arrays;

public class UniqueElementTwoPointer {
    public static void main(String[] args) {
        int a[] = { 1,2,2,3,4,3,4};
        Arrays.sort(a);
        int xor = 0;
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            if (i < j) {
                xor = xor ^ a[i] ^ a[j];

            } else {
                xor = xor ^ a[i];
            }
            i++;
            j--;
        }
        System.out.println(xor);

    }

}



