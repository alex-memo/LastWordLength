
public class Solution {

	public static void main(String[] args) {//q58
		// TODO Auto-generated method stub
		System.out.println(lengthOfLastWord("a "));

	}
	public static int lengthOfLastWord(String s) {
		s=removeLastSpaces(s);
		String temp=s;
		try {
			
			s=s.substring(s.lastIndexOf(' '));
			return s.length()-1;
		}
		catch(Exception e) {
			return temp.length();
		}
		
	}
	/**
	 * removes spaces from the string if ends with space
	 */
	private static String removeLastSpaces(String s) {
		char c=s.charAt(s.length()-1);
		while(c==' ') {
			s=s.substring(0, s.length()-1);
			c=s.charAt(s.length()-1);
		}
		return s;
		
	}
}
