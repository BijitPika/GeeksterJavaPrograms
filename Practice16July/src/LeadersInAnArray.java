public class LeadersInAnArray {
    public static void main(String[] args) {
        int a[]={16,17,4,3,5,2};

        for(int i=0;i<a.length;i++){
            int leader=a[i];
            boolean isLeader=true;
            for(int j=i+1;j<a.length;j++){

                if(a[j]<leader){
                    continue;
                }
                else{
                    isLeader=false;
                    break;

                }
            }
            if(isLeader==true){
                System.out.println(leader);
            }
        }
    }
}
