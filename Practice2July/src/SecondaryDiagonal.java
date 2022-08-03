import java.util.Scanner;

public class SecondaryDiagonal {
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
        //Swapping
        for(int i=0;i<row;i++){
            int temp=a[i][i];
            a[i][i]=a[i][row-1-i];
            a[i][row-1-i]=temp;
        }
        //Printing final Array
        System.out.println("The Required Array after Swapping Secondary and Primary Diagonal :");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

    

