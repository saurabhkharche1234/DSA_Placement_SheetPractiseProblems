//to verify whether entered string is pallindrome or not

package strings;

public class Pallindrome {

	public static boolean pallindrome(String s, int a) {   //boolean function to return the result
		
		for(int l=0,r = a;l<r;l++,r--) {
			while(l<r && !Character.isLetterOrDigit(s.charAt(l)))  //checking digits from start 
				l++;
			while(l<r && !Character.isLetterOrDigit(s.charAt(r)))  //checking digits from end
				r--;
			if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))  //if not equals then not pallindrome
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s = "this is not true";  //input string 
		int a = s.length()-1;   //string length
		System.out.println(pallindrome(s, a));   //printing and passing the values

	}

}
