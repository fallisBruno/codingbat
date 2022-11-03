package solutions;

public class Logic1 {

	public boolean cigarParty(int cigars, boolean isWeekend) {
		return (cigars >= 40 && cigars <= 60) || (isWeekend && cigars >= 40);
	}

	public int dateFashion(int you, int date) {
		if (you >= 3 && date >= 3) {
			if (you >= 8 || date >= 8)
				return 2;
			return 1;
		}
		return 0;
	}

	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (temp >= 60 && temp <= 100) {
			if (isSummer && temp <= 100)
				return true;
			if (temp <= 90)
				return true;
		}
		return false;
	}

	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (speed <= 60 + (isBirthday ? 5 : 0))
			return 0;

		if (speed <= 80 + (isBirthday ? 5 : 0))
			return 1;

		return 2;
	}

	public int sortaSum(int a, int b) {
		int sum = a + b;

		if (sum >= 10 && sum <= 19)
			return 20;

		return sum;
	}

	public String alarmClock(int day, boolean vacation) {
		if (day >= 1 && day <= 5) {
			if (vacation)
				return "10:00";
			return "7:00";
		} else {
			if (vacation)
				return "off";
			return "10:00";
		}
	}

	public boolean love6(int a, int b) {
		return (a == 6 || b == 6) || a + b == 6 || Math.abs(a - b) == 6;
	}

	public boolean in1To10(int n, boolean outsideMode) {
		if (n >= 1 && n <= 10 && !outsideMode)
			return true;

		if ((n <= 1 || n >= 10) && outsideMode)
			return true;

		return false;
	}

	public boolean specialEleven(int n) {
		if (n % 11 == 0 || (n - 1) % 11 == 0)
			return true;
		return false;
	}

	public boolean more20(int n) {
		if ((n - 1) % 20 == 0 || (n - 2) % 20 == 0)
			return true;
		return false;
	}

	public boolean old35(int n) {

		if (n % 3 == 0 && n % 5 == 0)
			return false;

		if (n % 3 == 0 || n % 5 == 0)
			return true;

		return false;
	}

	public boolean less20(int n) {
		return ((n + 1) % 20 == 0 || (n + 2) % 20 == 0);
	}

	public boolean nearTen(int num) {
		return num % 10 <= 2 || (Math.abs(num % 10 - 10) <= 2);
	}

	public int teenSum(int a, int b) {
		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19))
			return 19;

		return a + b;
	}

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isMorning) {
			if (isMom && !isAsleep) {
				return true;
			}
			return false;
		}

		if (isAsleep)
			return false;

		return true;
	}

	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy < 5)
			return 0;
		else if (tea >= candy * 2 || candy >= tea * 2)
			return 2;
		else
			return 1;
	}

	public String fizzString(String str) {
		String result = "";

		if (str.startsWith("f"))
			result += "Fizz";

		if (str.endsWith("b"))
			result += "Buzz";

		return result.isEmpty() ? str : result;
	}

	public String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0)
			return "FizzBuzz!";

		if (n % 3 == 0)
			return "Fizz!";

		if (n % 5 == 0)
			return "Buzz!";

		return String.valueOf(n) + "!";
	}

	public boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || a + c == b || b + c == a)
			return true;

		return false;
	}

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (bOk && c > b)
			return true;

		if (c > b && b > a)
			return true;

		return false;
	}

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (b < a || c < b)
			return false;

		if (equalOk)
			return true;

		return a < b && b < c;
	}

	public boolean lastDigit(int a, int b, int c) {
		return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
	}

	public boolean lessBy10(int a, int b, int c) {
		return (Math.abs(a - b)) >= 10 || (Math.abs(a - c)) >= 10 || (Math.abs(b - c)) >= 10;
	}

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (die1 == die2 && noDoubles) {
			if (die1 == 6)
				return 7;
			return die1 + die2 + 1;
		}

		return die1 + die2;
	}

	public int maxMod5(int a, int b) {
		if (a == b)
			return 0;

		if (a % 5 == b % 5)
			return Math.min(a, b);

		return Math.max(a, b);
	}

	public int redTicket(int a, int b, int c) {
		if (a == 2 && b == 2 && c == 2)
			return 10;

		if (a == b && b == c)
			return 5;

		if (a != b && c != a)
			return 1;

		return 0;
	}

	public int greenTicket(int a, int b, int c) {
		if (a == b && b == c)
			return 20;

		if (a == b || b == c || c == a)
			return 10;

		return 0;
	}

	public int blueTicket(int a, int b, int c) {
		if (a + b == 10 || b + c == 10 || a + c == 10)
			return 10;

		if ((a + b) - (b + c) >= 10 || (a + b) - (a + c) >= 10)
			return 5;

		return 0;
	}

	public boolean shareDigit(int a, int b) {
		int leftA = a / 10, rightA = a % 10;
		int leftB = b / 10, rightB = b % 10;

		return leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB;
	}

	public int sumLimit(int a, int b) {
		return String.valueOf(a + b).length() > String.valueOf(a).length() ? a : a + b;
	}

}
