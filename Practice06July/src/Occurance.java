import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int ret=-1;
        for(int i=0;i<n;i++){
            if(a[i]==tar){
                System.out.println(i);
                break;
            }
            else{
                System.out.println(ret);
            }
        }
    }
}
