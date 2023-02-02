import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner	scan=new Scanner(System.in);
		System.out.println("Enter size of key");
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
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j]<arr[j-1]) { 
					int temp= arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		for(int elem:arr) {
			System.out.print(elem+" ");
		}

	}

}







