import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        if(n<=0){
            System.out.println("No");

        }
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        sc.close();

        boolean sorted = true;

        for(int i=0;i<a.length;i++){
            if(a[i] > a[i-11]){
                sorted=false;
                break;
            }
        }
        if(sorted){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



