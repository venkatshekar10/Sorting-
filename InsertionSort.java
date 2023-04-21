#Stable Algorithm
# It is used when Array size is small.
# Even built in library function switches to insertion Sort when size of array is small.
# Best Case: O(n) i.e when array is already Sorted.
# Worst Case: O(n^2).
  
Code....
  
import java.util.*;
public class codeforces{
	public static void InsertionSort(int a[],int n) {
		for(int i=1;i<n;i++) {
			int x=a[i];
			int j=i-1;
			while(j>=0 && a[j]>x) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=x;
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a[]= {12,3,4,1,7,5};
		int n=a.length;
		InsertionSort(a,n);
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
}


Complexity: O(n^2),O(1).
  
Bubble Sort , Selection Sort and Insertion Sort are in-place Sorting algorithms.
