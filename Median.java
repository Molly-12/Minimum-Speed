import java.util.*;
public class Solution{
    static double median(int a[],int b[]){
        int n=a.length();
        int m=b.length();
        if(n>m)
            return median(b,a);
        int start=0;
        int end=n;
        int x=(n+m+1)/2;
        while(start<=end){
            int mid=(start+end)/2;
            int leftasize=mid;
            int leftbsize=x-mid;
            int lefta=(leftasize>0)?a[leftasize-1]:integer.MIN_VALUE;
            int leftb=(leftbsize>0)?b[leftbsize-1]:Integer.MIN_VALUE;
            int righta=(leftasize<n)?a[leftasize]:Integer.MAX_VALUE;
            int rightb=(leftbsize<m)?b(leftbsize):Integer.MAX_VALUE;
            if(lefta<=rightb && leftb<=righta){
                if((m+n)%2==0)
                    return(Math.max(lefta,leftb)+Math.min(righta,rightb));
                return Math.max(lefta,leftb);
            }
            else if(lefta>rightb){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            return 0.0;
            
        }
    
    
        
        
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int e=sc.nextInt();
        int arr1[]=new int[d];
        int arr2[]=new int[e];
        for(int i=0;i<d;i++)
            arr1[i]=sc.nextInt();
        for(int j=0;j<e;j++)
            arr2[i]=sc.nextInt();
        System.out.println(median(arr1,arr2));
        }
    
}
        
    
    
