import java.util.Arrays;

public class LaunchAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Race";
		String str2= "carE";
		
		str1 =str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char [] ch1 = str1.toCharArray();
		char [] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("its an Anagram");
		}
		else {
			System.out.println("not an anagram");
		}

	}

}
