package solutions;

public class String1 {

	public static void main(String[] args) {
		
	}

	public String withoutX2(String str) {

		if (str.length() < 1)
			return "";

		if (str.length() < 2)
			if (str.charAt(0) == 'x')
				return str.substring(1);

		if (str.substring(0, 2).equals("xx"))
			return str.substring(2);

		if (str.charAt(0) == 'x')
			return str.substring(1);

		if (str.charAt(1) == 'x')
			return str.substring(0, 1).concat(str.substring(2));

		return str;
	}

	public String withoutX(String str) {
		if (str.length() < 2)
			return "";

		if (str.charAt(0) == 'x')
			str = str.substring(1);

		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);

		return str;
	}

	public String startWord(String str, String word) {
		if (word.length() > str.length())
			return "";

		if (str.substring(0, word.length()).equals(word)) {
			return str.substring(0, word.length());
		}

		if (str.substring(1, word.length()).equals(word.substring(1))) {
			return str.substring(0, word.length());
		}

		return "";
	}

	public String deFront(String str) {
		String result = "";

		if (str.charAt(0) == 'a') {
			result = result.concat("a");
		}

		if (str.charAt(1) == 'b') {
			result = result.concat("b");
		}

		return result + str.substring(2);
	}

}
