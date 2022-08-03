import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int arr[] = {4,3,9,8,7};
        int brr[]=new int [arr.length];
        int j=0;

        for(int i =arr.length-1;i>=0;i--) {
            brr[j]=arr[i];
            j++;

        }
        System.out.print(Arrays.toString(brr));
    }

}
