# Count Sort is used when array range is small
# if a<=ar[i]<=b then range=b-a+1;
# if a<ar[i]<b then range=b-a-1;
# if a<=ar[i]<b (or) a<ar[i]<=b then range=b-a;
The time complexity is O(n+r) wheren is array size and r is range.
#The space complexity is O(r) where r is range.
# When r is very large i.e 10^7 we cannot use count sort.Rather we can use radix sort for higher ranges.
  
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void CountSort(int ar[],int n,int a,int b){
        int r=b-a+1;
        int count[]=new int[r];
        for(int i=0;i<r;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[ar[i]]++;
            #count[ar[i]-a]++;
        }
        int idx=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<count[i];j++){
                ar[idx++]=i;
                #ar[idx++]=i+a;
            }
        }
    }
    
    
    
	public static void main(String[] args) {
		int ar[]={3,5,8,3,1,10,5,5,3,8,5,5};
    #int ar[]={-4,5,3,3,3,-2,-1,4,2,4};
		int n=ar.length;
		int a=0,b=10;
    #int a=-4,b=5;
		CountSort(ar,n,a,b);
		for(int x:ar){
		    System.out.print(x+" ");
		}
	}
}
