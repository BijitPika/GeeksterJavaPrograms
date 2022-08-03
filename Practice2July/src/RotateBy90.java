import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size :");
        int row = sc.nextInt();
        System.out.println("Enter Column Size :");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        //Original Array
        System.out.println("The Array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        //Transpose
        System.out.println("The Transposed Array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //Rotation
        for (int i = 0; i < row; i++) {
            int j = 0;
            int k = row - 1;
            while (j < k) {
                int temp = a[i][j];
                a[i][j] = a[i][k];
                a[i][k] = temp;
                j++;
                k--;
            }
        }
        //printing rotated array
        System.out.println("Rotated Array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
