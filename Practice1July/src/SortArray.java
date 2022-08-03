
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();

        int a[][]= new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("The User Array :");
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int tempo[]= new int[m*n];
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                tempo[c]=a[i][j];
                c++;
            }
        }

        Arrays.sort(tempo);
        int k=0;
        System.out.println("The Sorted Array :");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(tempo[k]+" ");
                k++;
            }
            System.out.println();
        }
    }
}
