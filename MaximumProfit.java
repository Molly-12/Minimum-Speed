import java.util.*;
class Solution{
    public int maxprofit(int p[]){
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        for(int i=0;i<p.length;i++){
            if(p[i]<minp)
                minp=p[i];
            else if(p[i]-minp>maxp)
                maxp=p[i]-minp;
        }
        return maxp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            System.out.println(new Solution().maxprofit(arr));
        
    }
}
