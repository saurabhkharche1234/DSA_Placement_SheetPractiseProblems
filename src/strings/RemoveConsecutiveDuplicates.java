//program to remove consecutive duplicates from given string 
// time complexity O(N)
//space complexity O(1)
package strings;

public class RemoveConsecutiveDuplicates {

	public static String remove(String s) {
		//initialize start and stop pointers 
		int i =0, j = 0;
		//initialize empty string for new elements
		String Empty = "";
		//iterate string using j pointer
		
		while(j<s.length()) {
			//if both elements are same then skip
			if(s.charAt(i)==s.charAt(j))
				j++;
			//if both elements are not same then append new elementx	`
			else if(s.charAt(j)!=s.charAt(i)||j != s.length()-1){
				Empty += s.charAt(i);
				//after appending slide over window
				i=j;
				j++;
			}
			
		}
		//append last string 
		Empty += s.charAt(j-1);
		return Empty;
	}
	
	public static void main(String[] args) {
		String s = "aaabbabababba";
		System.out.println("input:: "+s);//String before removing consecutive duplicates
		System.out.println("output:: "+remove(s)); //After removing consecutive duplicates
	}

}
