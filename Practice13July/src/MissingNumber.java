
public class MissingNumber {
    public static void main(String[] args) {

        int a[]= {1,3,4,5,6};
        int n=a.length+1;
        int Totalsum= n*(n+1)/2;
        int sumOfArray=0;
        int i=0;
        int j=a.length-1;
        int missingNumber=0;
        while(i<=j){
            if(i<j){
                sumOfArray=sumOfArray+a[i];
                i++;
            }
            else{
                sumOfArray=sumOfArray+a[j];
                j--;
                System.out.println(sumOfArray);
            }
             missingNumber=Totalsum-sumOfArray;


        }
        System.out.println("Total Sum :"+sumOfArray);
        System.out.println("Missing Number :"+missingNumber);



    }

}
