public class IfElementExists {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 9, 10, 15};
//        int target = 13;

        for (int k = 1; k <= 19; k++) {
            boolean flag = false;

            for (int i = 0; i < a.length; i++) {
                if (a[i] == k) {
                    flag = true;
                    break;

                }
            }
            if (flag == false) {
                System.out.println(k);
                break;
            }
        }
    }
}

