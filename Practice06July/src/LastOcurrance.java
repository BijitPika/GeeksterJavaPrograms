
import java.util.Scanner;

public class LastOcurrance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String Length :");
        int n=sc.nextInt();
        System.out.println("Enter String Elements :");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter a Target :");
        int target=sc.nextInt();
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < a.length; i++) {

            //find the first index
            if (a[i] == target && firstIndex == -1) {
                firstIndex = i;
            }

            //find the last index

            int ind = a.length - 1 - i; // if i is 0, this will get 4, i -> 1 -> 3....
            if (a[ind] == target && lastIndex == -1) {
                lastIndex = ind;
            }
        }

        System.out.println("First Index :"+firstIndex);
        System.out.println("Last Index :"+lastIndex);


    }
}
