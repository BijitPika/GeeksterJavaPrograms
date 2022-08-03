import java.util.Scanner;

public class ifPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int count=0;
        for(int i=0;i<m;i++){
            int j=0;
            int k=n-1;
            boolean p=true;
            while(j<k){
                if(arr[i][j]!=arr[i][k]){
                    p=false;
                    break;
                }
                j++;
                k--;
            }
            if(p){
                count++;
            }
        }
        System.out.println(count);
    }
}
