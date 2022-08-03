import java.util.Scanner;

public class Arrays04July {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            char []ch=new char[n];
            for(int i=0;i<ch.length;i++){
                String s=sc.nextLine();
                ch[i]=s.charAt(0);
            }
            int UpperCase=0;
            int LowerCase=0;
            for(int i=0;i<ch.length;i++) {
                if(ch[i]>='A' && ch[i]<='Z'){
                    UpperCase++;
                }
                else if(ch[i]>='a' && ch[i]<='z'){
                    LowerCase++;
                }
            }System.out.println("Upper Case :" +UpperCase);
            System.out.println("Lower Case :"+LowerCase);
        }

}


