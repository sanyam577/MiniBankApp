
public class Pannagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1 = ("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        str1 = str1.replace(" ", "");
        boolean flag = false;
        
	    char [] ch = str1.toCharArray();
	    int [] ar = new int[26];
	    
	   
	    
	    for(int i=0; i<ch.length; i++) { //to fill value in empty array
	    	int index = ch[i]-65;
	    	ar[index]++;
	    }
	    
	    for(int i=0; i<ar.length; i++) {
	    	if(ar[i]==0) {
	    		System.out.println("Not a Pangram");
	    		flag=true;
	    	}
	    	
	    }
	    if(flag==false) {
	    		System.out.println("Its a pangram");
	    }
	    
	    
	    
	}

}
