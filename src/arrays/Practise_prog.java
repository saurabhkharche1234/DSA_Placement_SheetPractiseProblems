package arrays;

public class Practise_Prog {
	
	public static boolean pallindrome(String s, int a) {
		
		for(int l =0, r = a;l<r;l++,r--) {
			while(l<r && !Character.isLetterOrDigit(s.charAt(l)))
				l++;
			while(l<r && !Character.isLetterOrDigit(s.charAt(r)))
				r--;
			if(Character.toLowerCase(s.charAt(l))!= Character.toLowerCase(s.charAt(r)))
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String s = "a cat tac a";
		int a = s.length()-1;
		System.out.println(pallindrome(s,a));
		
	}
}
