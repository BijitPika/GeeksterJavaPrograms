import java.util.Scanner;

public class methodPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int ans;
        ans= sum(sc.nextInt(),sc.nextInt());
        System.out.println(ans);
        ifOdd();
    }
    static int sum(int a,int b){
        return a+b;
    }
    static void ifOdd(){

        if(ans%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }



    }
}
