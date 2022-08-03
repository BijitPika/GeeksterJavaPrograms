import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
//       int ans=sum2();
//        System.out.println(ans);
        int ans=sum3(20,30);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int sum2(){
        Scanner sc =new Scanner (System.in);
        int n1,n2,sum;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        return sum;
    }
    static void sum(){
        Scanner sc =new Scanner (System.in);
        int n1,n2,sum;
        n1=sc.nextInt();
        n2=sc.nextInt();
        sum=n1+n2;
        System.out.println(sum);
    }
}
