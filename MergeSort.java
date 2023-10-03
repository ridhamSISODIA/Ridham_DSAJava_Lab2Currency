package currency;

import java.util.Arrays;

public class MergeSort {

	public void sort(int[] arr, int left, int right) {
		if(left<right)
		{
		int mid=(left+right)/2;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		merge(arr,left,mid,right);
		}
	}

	private void merge(int[] arr, int left, int mid, int right) {
		
		
		int brr[]=new int[right+1];
		int i=left;
		int j=mid+1;
		int k=left;
		
		while(i<=mid && j<=right)
		{
			if(arr[i]>=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=right)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		else
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
	
		for(int z=left;z<=right;z++)
			arr[z]=brr[z];
	}

}

