
public class QuickSort {
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high; j++){
			if(arr[j]<pivot) {
				i++;
				
				int temp =arr[i];
				arr[i]= arr[j];
				arr[j]=temp;
			}
			
		}
		i++;
		int temp = arr[i];
		arr[i] =pivot;
		arr[high]= temp;
		return i;
				
	}
	
	
	
	public static void quickS(int arr[], int low, int high) {
		if(low < high) {
			int pivotidx = partition(arr, low, high);
			
			quickS(arr, low, pivotidx-1);
			quickS(arr, pivotidx+1, high);
		}
	}	
	
public static void main(String args[]) {
	int [] arr = {95,65,52,75,23,25};
	int n = arr.length;
	 
	quickS(arr, 0, n-1);
	
	for(int i=0; i<n; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
}
}











