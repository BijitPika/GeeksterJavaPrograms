import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n=sc.nextInt();
        System.out.println("Enter Array Elements :");
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(a[i]==a[j] && i<j) {
                    count++;
                }
            }
        }
        System.out.println("Good Pairs :"+count);
    }
}



