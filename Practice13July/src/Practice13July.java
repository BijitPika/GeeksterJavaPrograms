import java.util.Arrays;


public class Practice13July {
    public static void main(String[] args) {
        char a[] = {'a','e','t','H','A','T'};

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            if (a[i] >='A'&& a[i]<='Z') {
                i++;
            }
            if (a[j] >='a'&&a[j]<='z') {
                j--;
            }
            if (a[j]>='A'&& a[j]<='Z' && a[i]>='a' && a[i]<='z'
            ) {
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
