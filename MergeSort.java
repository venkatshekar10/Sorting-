public class Main
{
    
    public static void Merge(int a[],int low,int mid,int high){
        int n=high-low+1;
        int temp[]=new int[n];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(a[i]<=a[j]) temp[k++]=a[i++];
            else temp[k++]=a[j++];
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=high){
            temp[k++]=a[j++];
        }
        int v=0;
        for(int x=low;x<=high;x++){
            a[x]=temp[v++];
        }
    }
    
    
    
    
    public static void MergeSort(int a[],int low,int high){
        
        if(low==high) return;
        int mid=(low+high)/2;
        MergeSort(a,low,mid);
        MergeSort(a,mid+1,high);
        Merge(a,low,mid,high);
        
        
    }
    
    
    
	public static void main(String[] args) {
		int a[]={10,2,18,5,12,7,25,15,2,5};
		int n=a.length;
		int low=0;
		int high=n-1;
		MergeSort(a,low,high);
		for(int x:a){
		    System.out.print(x+" ");
		}
		
	}
}


TC:O(nlogn)
SC:O(n)
