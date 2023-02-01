import java.util.Arrays;
import java.util.Scanner;
public class ModifiedAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first string");
		String str1 = scan.nextLine();
		
		//to lower case
		String str3 ="";
		for(int i=0; i<str1.length(); i++) {
			
			if(str1.charAt(i)>=65 && str1.charAt(i)<=90) {
				str3 = str3 + (char)(str1.charAt(i)+32);
				}
				else {
					str3 = str3 + str1.charAt(i);
				}
		}
		
		 System.out.println(str3);
		 
		 //String to character array
		 char [] ch1 = new char[str3.length()]; 
	       for(int i=0; i<str3.length(); i++) {
			ch1[i]= str3.charAt(i);
	       }
	       
	       for(char c1: ch1) {
	       System.out.print(" "+ c1);
	       }
	       System.out.println();
	       
	       //BUBBLE SORT
	       for(int i=0;i<ch1.length;i++) {
				for(int j=1; j<ch1.length-i; j++) {
					if(ch1[j]<ch1[j-1]) { 
						char temp= ch1[j];
						ch1[j]=ch1[j-1];
						ch1[j-1]= temp;
					}
				}
			}
			for(char elem:ch1) {
				System.out.print(elem+" ");
			}
	       
			System.out.println();
	       
	       
	       
	       
	       
	       
	       
	       
	       
	    System.out.println("Enter second string");
	    String str2 = scan.nextLine();
	    
	    //to lower case
	     String str4 ="";
	     for(int i= 0; i<str2.length(); i++) {
	    	 if(str2.charAt(i)>=65 && str2.charAt(i)<=90) {
					str4 = str4 + (char)(str2.charAt(i)+32);
					}
					else {
						str4 = str4 + str2.charAt(i);
					}
	     }
	     System.out.println(str4);
	     
	     //String to char array
	     char [] ch2 = new char[str4.length()];
	     for(int i=0; i<str4.length(); i++) {
	    	 ch2[i] = str4.charAt(i);
	     }
	     for(char c2: ch2) {
	    	 System.out.print(" "+c2);
	     }
	     System.out.println();
	     
	     //BUBBLE SORT
	       for(int i=0;i<ch2.length;i++) {
				for(int j=1; j<ch2.length-i; j++) {
					if(ch2[j]<ch2[j-1]) { 
						char temp= ch2[j];
						ch2[j]=ch2[j-1];
						ch2[j-1]= temp;
					}
				}
			}
			for(char elem:ch2) {
				System.out.print(elem+" ");
			}
	       
			System.out.println();
			
			
			
				if(Arrays.equals(ch1, ch2)) {
					System.out.println("its an Anagram");
				}
				else {
					System.out.println("not an anagram");
				}
		
	     
	     
	     
	     
	     
	     
	    
		

	}

}
