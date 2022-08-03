import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int n = ReadInput();
        ifArmstrong(n);

    }

     public static int ReadInput() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    static void ifArmstrong(int num) {
        int temp = num;

        //find digit
        // find cube of digit
        // find sum of all cubes

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;

            num = num / 10;
        }


        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Non Armstrong");
        }
    }
}


