//program to print all possible permutations of given string "ABC".
// possible permutations will be n! i.e. 3! = 6. hence 6 possible combinations can be formed 

package backtrackingProblems;

public class BacktrackingDemo {
	
	public static void printPermutation(String s, String perm, int idx) {
		if(s.length()==0) {
			System.out.println(perm);
			return;
		}
		for(int i =0; i<s.length();i++) {
			char currentChar = s.charAt(i);
			String newPerm = s.subSequence(0, i)+ s.substring(i+1);
			printPermutation(newPerm, perm+currentChar, idx+1);
		}
	}
	
	public static void main(String[] args) {
		String s = "ABC";
		printPermutation(s, "",0);
	}

}
