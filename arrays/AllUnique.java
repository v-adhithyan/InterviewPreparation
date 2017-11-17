import java.util.*;

class AllUnique {
	public static boolean isUnique(String word) {
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<word.length(); i++) {
			if(set.contains(word.charAt(i)))
				return false;
			set.add(word.charAt(i));
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.next();
		System.out.println(word +  " is unique:" + isUnique(word));
	}

}
