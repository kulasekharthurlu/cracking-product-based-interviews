package strings;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		var result = findFirstNotRepeatingChar("kulasekhar");
		System.out.println(result);
	}

	public static String findFirstNotRepeatingChar(String str) {
		 if(str == null || str.length() == 0) {
			 return "";
		 }
		 for(char i=0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				 return  String.valueOf(ch);
			 }
		 }
		return "";
	}
}
