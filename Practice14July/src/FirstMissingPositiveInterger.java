public class FirstMissingPositiveInterger {
    public static void main(String[] args) {
        int a[]={-4,-7,-2,1,2,7};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        if(max<0){
            System.out.println(1);
            return;
        }
        else{
            for(int i=1;i<max+1;i++){
                boolean found=false;
                for(int j=0;j<a.length;j++){
                    if(a[j]==i){
                        found=true;
                        break;
                    }
                }
                if(found==false){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
