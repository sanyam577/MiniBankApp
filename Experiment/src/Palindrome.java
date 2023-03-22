
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1 = "2552";
         String str2 ="";
         
         for(int i=str1.length()-1; i>=0; i--) {
        	 str2= str2 + str1.charAt(i);
         }
        
      System.out.print(" "+str2);
       
       if(str1.equals(str2)) {
    	   System.out.println("  is palindrome");
       }
       else {
    	   System.out.println("No not a palindrome");
       }
       
	}

}
