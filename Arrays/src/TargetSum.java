import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target =sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(i+j==target){
                    System.out.println(i+","+j);
                }
            }
        }
    }

}
