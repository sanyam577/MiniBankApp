import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner	scan=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n =scan.nextInt();
		int [] arr=new int[n];
		
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter element for index "+i);
			arr [i]=scan.nextInt();
		}
		System.out.println("Here is our array ");
		for(int i=0; i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("This is our sorted array");
		
		for(int i=0;i<arr.length;i++) {
			int min_indx =i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min_indx]) { 
					min_indx=j;
					int temp= arr[min_indx];
					  arr[min_indx] = arr[i];
			            arr[i] = temp;
				}
			}
		}
		for(int elem:arr) {
			System.out.print(elem+" ");
		}

	}

}









