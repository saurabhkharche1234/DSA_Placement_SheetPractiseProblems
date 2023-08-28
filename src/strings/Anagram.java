//check if the given word is anagram or not
//a word or phrase formed by rearranging the letters of different word or phase, typically using all original letters exactly once
//time complexity :: O(n) + O(26) i.e. O(n)

package strings;

public class Anagram {

	public static boolean isAnagram(String a, String b) {
		if(a.length()!=b.length())
		return false;
		int freq1[] = new int[26];//array to count frequency of each letter of string a
		int freq2[] = new int[26];   //to count frequency of each letter of string b
		
		for(int i = 0; i< a.length(); i++) {  //loop to count the frequency 
				freq1[a.charAt(i)-'a']++;
				freq2[b.charAt(i)-'a']++;
		}
		for(int i = 0;i<26;i++) {
		if(freq1[i]!=freq2[i])  //comparing the freq of each letter, if freq equals then anagram
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
	String a = "anagram";
	String b = "nagaram";
	System.out.println(isAnagram(a,b));//printing and passing two strings 

	}

}
