public class InvertedRtAngleAlphabet {
    public static void main(String[] args) {
        for(char c1='E';c1>='A';c1--){
            for(char c2=c1;c2>='A';c2--){
                System.out.print(c2+" ");
            }
            System.out.println();
        }

    }
}
