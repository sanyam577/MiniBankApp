
public class MergeSort {
	public static void sort(int arr[], int start, int mid, int end) {
		int [] merged = new int[end - start+1];
		int indexof1= start;
		int indexof2 = mid+1;
		int x = 0; //first index of merged array
		
		while(indexof1 <=mid && indexof2<=end) {
			if(arr[indexof1]<=arr[indexof2]) {
				merged[x] = arr[indexof1];
				x++; indexof1++;
			}
			else {
				merged[x++] = arr[indexof2++];
			}
		}
		while(indexof1<=mid) {
			merged[x++] =arr[indexof1++];
		}
		
		while(indexof2 <= end) {
			merged[x++] = arr[indexof2++];
		}
		
		for(int i=0, j=start; i<merged.length; i++, j++) {
			arr[j] = merged[i];
		}
		
		
	}
	public static void divide(int arr[], int start, int end) {
		if(start >= end) {
			return;
		}
		
		int mid = start + (end-start)/2;
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		sort(arr, start, mid, end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,29,7,65,28,97,33};
		int n = arr.length;
		
		divide(arr, 0, n-1);
		//print
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}




