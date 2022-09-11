import java.util.*;
class Solution{
    static int largest(int arr[]){
        int i;
        int max=arr[0];
        for(i=1;i<arr.length;i++)
            if(arr[i]>max)
                max=arr[i];
                
        
        return max;
    }
    public static int mineatspeed(int b[],int t){
        int low=1;
        int high=largest(b);
        while(low<high){
            int mid=(low+high)/2;
            if(possible(b,t,mid))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    public static boolean possible(int b[],int t,int s){
        int time=0;
        for(int b1:b){
            time+=(b1-1)/s+1;
        }
        return time<=t;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str[]=sc.nextLine().split(" ");
        int b[]=new int[str.length];
        for(int i=0;i<str.length;i++){
            b[i]=Integer.valueOf(str[i]);
        }
        int hours=sc.nextInt();
        System.out.println(mineatspeed(b,hours));
    }
}
