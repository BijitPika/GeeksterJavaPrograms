import java.util.Scanner;

public class RotateMatrix90Anticlockwise {
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
        System.out.println("The Original Array :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------");
        //Rotation
        for (int i = 0; i < col; i++) {
            int j = 0;
            int k = col - 1;
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
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
