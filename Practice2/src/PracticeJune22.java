import java.util.Scanner;

public class PracticeJune22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rem, rev = 0;
        int num = sc.nextInt();
        int temp=num;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("The reverse number is :" + rev);
        if (temp == rev) {
            System.out.println("The number is palindrome :" + temp);
        } else {
            System.out.println("The number is not palindrome :" + temp);
        }
    }

}


