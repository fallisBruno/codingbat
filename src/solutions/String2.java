package solutions;

import java.util.*;

public class String2 {

	public static void main(String[] args) {
		System.out.println(ispar("{}{(}))}"));
	}

	public static String doubleChar(String str) {

		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			result.append(c).append(c);
		}

		return result.toString();
	}

	public static int countHi(String str) {
		int count = 0;

		for (int index = 0; index < str.length() - 1; index++) {
			if ("hi".equals(str.substring(index, index + 2)))
				count++;
		}

		return count;
	}

	public static boolean catDog(String str) {

		int countDog = 0, countCat = 0;

		for (int index = 0; index < str.length() - 2; index++) {
			if ("dog".equals(str.substring(index, index + 3)))
				countDog++;
			if ("cat".equals(str.substring(index, index + 3)))
				countCat++;
		}

		return countDog == countCat;
	}

	public static int countCode(String str) {
		// co[^.]e

		int count = 0;

		for (int index = 0; index < str.length() - 3; index++) {
			if (str.substring(index, index + 4).matches("co[^.]e"))
				count++;
		}

		return count;
	}

	public static boolean endOther(String a, String b) {
		if (a.length() > b.length()) {
			return a.substring(a.length() - b.length()).equalsIgnoreCase(b);
		} else {
			return b.substring(b.length() - a.length()).equalsIgnoreCase(a);
		}
	}

	public static boolean xyzThere(String str) {
		for (int index = 0; index < str.length() - 2; index++) {
			if ("xyz".equals(str.substring(index, index + 3))) {
				if (index == 0)
					return true;
				if (str.charAt(index - 1) != '.')
					return true;
			}
		}
		return false;
	}

	public static boolean xyBalance(String str) {
		String balanceString = str.replaceAll("[^xy]", "");
		if (balanceString.endsWith("y"))
			return true;
		if (balanceString.isEmpty())
			return true;
		return false;
	}

	public static String mixString(String a, String b) {
		String result = "";
		for (int index = 0; index < a.length() + b.length(); index++) {
			if (index < a.length())
				result += a.charAt(index);
			if (index < b.length())
				result += b.charAt(index);
		}
		return result;
	}

	public static String repeatEnd(String str, int n) {
		String strToRepeatString = str.substring(str.length() - n);
		String resultString = "";
		for (int iteration = 0; iteration < n; iteration++) {
			resultString += strToRepeatString;
		}
		return resultString;
	}

	public static String repeatFront(String str, int n) {
		String resultString = "";
		while (n > 0) {
			resultString += str.substring(0, n);
			--n;
		}
		return resultString;
	}

	public static String repeatSeparator(String word, String sep, int count) {
		return String.join(sep, Collections.nCopies(count, word));
	}

	public boolean prefixAgain(String str, int n) {
		String prefix = str.substring(0, n);
		str = str.replaceFirst(prefix, "");
		return str.contains(prefix);
	}

	public static boolean xyzMiddle(String str) {

		if ("xyz".equals(str))
			return true;

		for (int index = 0; index < str.length() - 3; index++) {

			if ("xyz".equals(str.substring(index, index + 3))) {

				String rightString = str.substring(index + 3);
				String leftString = str.substring(0, index);

				if (Math.abs(rightString.length() - leftString.length()) <= 1)
					return true;

			}

		}

		return false;

//		str = str.replaceAll("xyz", "-");
//		
//		char[] charArray = str.toCharArray();
//		
//		for (int index = 0; index < charArray.length; index++) {
//			if(charArray[index] == '-') {
//				int countLeft = 0, countRight = 0;
//				if(index > 0) {
//					for (int leftIndex = index - 1; leftIndex >= 0; leftIndex--) {
//						if(charArray[leftIndex] == '-')
//							countLeft+=3;
//						else {
//							countLeft++;
//						}
//					}
//				}else {
//					countLeft = 1;
//				}
//				
//				for (int rightIndex = index + 1; rightIndex < charArray.length; rightIndex++) {
//					if(charArray[rightIndex] == '-')
//						countRight+=3;
//					else {
//						countRight++;
//					}
//				}
//				
//				if(( Math.abs(countLeft - countRight) <= 1 ) ) {
//					return true;
//				}
//			}
//		}
//		
//		return false;

//		String[] split = str.split("xyz");
//		
//		for(int index = 0; index < split.length - 1;index++) {
//			int currentSize = split[0].length();
//			boolean firstValidation = Math.abs(currentSize - split[index+1].length()) <= 1;
//			boolean secondValidation = (split[index] == "" || split[index] == " ") && (split[index+1] == "" || split[index+1] == " ");
//			if(firstValidation && !secondValidation) {
//				return true;
//			}
//		}
//		return false;

//		int indexXYZ = str.lastIndexOf("xyz");
//		
//		String beforeXYZ = str.substring(0, indexXYZ);
//		String afterXYZ = str.substring(indexXYZ+3);
//		
//		return Math.abs( beforeXYZ.length() - afterXYZ.length() ) <= 1; 
	}

	public static String getSandwich(String str) {
		int firstBreadPos = -1;
		for (int index = 0; index < str.length() - 5; index++) {
			if ("bread".equals(str.substring(index, index + 5))) {
				firstBreadPos = index;
				break;
			}
		}

		int lastIndexOfBread = str.lastIndexOf("bread");

		if (firstBreadPos == lastIndexOfBread)
			return "";

		return str.substring(firstBreadPos + 5, lastIndexOfBread);
	}

	public boolean sameStarChar(String str) {
		for (int index = 0; index < str.length() - 1; index++) {
			if (str.charAt(index) == '*' && index > 0 && (str.charAt(index - 1) != str.charAt(index + 1))) {
				return false;
			}
		}
		return true;
	}
	
	public static String oneTwo(String str) {
		String result = "";
		for(int index = 0; index < str.length() - 2;index+=3) {
			String currentSlice = str.substring(index, index + 3);
			result+=currentSlice.substring(1) + currentSlice.charAt(0); 
		}
		return result;
	}
	
	public static String starOut(String str) {
		str = " " + str + " ";
		char[] charArray = str.toCharArray();
		String result = "";
		for (int index = 1; index < charArray.length - 1; index++) {
			if(charArray[index] != '*' && charArray[index-1] != '*' && charArray[index+1] != '*'){
				result+=charArray[index];
			}
		}
		return result;
	}

	public static String plusOut(String str, String word) {
		char[] result = new char[str.length()];
		for (int index = 0;index <= str.length() - word.length();index++){
			if(str.substring(index, index + word.length()).equals(word) ){
				for (int wordIndex = index; wordIndex < index + word.length(); wordIndex++) {
					result[wordIndex]=str.charAt(wordIndex);
				}
			}
		}
		for (int index = 0;index < str.length();index++){
			if(result[index] == 0){
				result[index]='+';
			}
		}
		return new String(result);
	}

	public static String wordEnds(String str, String word) {
		str = " " + str + " ";
		String result = "";
		for (int index = 0; index < str.length() - word.length(); index++) {
			if(word.equals( str.substring(index, index + word.length()) )){
				result+=str.charAt(index-1);
				result+=str.charAt(index+word.length());
			}
		}
		return result.trim();
	}

	static boolean ispar(String x)
	{
		// add your code here
		List<String> opening = List.of("(", "{", "[");
		List<String> closing = List.of(")", "}", "]");

		Stack stack = new Stack<String>();
		for(int index = 0;index < x.length();index++){

			String currentValue = String.valueOf( x.charAt(index) );

			if(opening.contains(currentValue)){
				stack.push(currentValue);
			}else if(closing.contains(currentValue) && stack.empty()){
				return false;
			}else if(closing.contains(currentValue)){
				if(stack.empty()){
					return false;
				}
				String topElement = String.valueOf( stack.peek() );
				if( opening.indexOf(topElement) == closing.indexOf(currentValue) ){
					System.out.println( "Element removed from the stack: " + stack.pop() );
				}else{
					return false;
				}
			}
		}

		return stack.empty();
	}

}
