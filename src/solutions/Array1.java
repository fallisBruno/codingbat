package solutions;

public class Array1 {

	public static void main(String[] args) {

	}

	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	public boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}

	public int[] makePi() {
		return new int[] { 3, 1, 4 };
	}

	public boolean commonEnd(int[] a, int[] b) {
		return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		return new int[] { nums[1], nums[2], nums[0] };
	}

	public int[] reverse3(int[] nums) {
		return new int[] { nums[2], nums[1], nums[0] };
	}

	public int[] maxEnd3(int[] nums) {
		int largerElement = nums[0] > nums[2] ? nums[0] : nums[2];

		nums[0] = largerElement;
		nums[1] = largerElement;
		nums[2] = largerElement;

		return nums;
	}

	public int sum2(int[] nums) {
		if (nums.length < 2) {
			if (nums.length < 1)
				return 0;
			return nums[0];
		}

		return nums[0] + nums[1];
	}

	public int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}

	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	public boolean has23(int[] nums) {
		return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
	}

	public boolean no23(int[] nums) {
		return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
	}

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];
		newArray[newArray.length - 1] = nums[nums.length - 1];
		return newArray;
	}

	public boolean double23(int[] nums) {
		if (nums.length < 2)
			return false;

		return (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
	}

	public int[] fix23(int[] nums) {
		if (nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
			return nums;
		}

		if (nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
			return nums;
		}

		return nums;
	}

	public int start1(int[] a, int[] b) {
		int count = 0;

		if (a.length > 0 && a[0] == 1)
			count++;
		if (b.length > 0 && b[0] == 1)
			count++;

		return count;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int sumA = a[0] + a[1];
		int sumB = b[0] + b[1];

		return sumA >= sumB ? a : b;
	}

	public int[] makeMiddle(int[] nums) {
		return new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2] };
	}

	public int[] plusTwo(int[] a, int[] b) {
		return new int[] { a[0], a[1], b[0], b[1] };
	}

	public int[] swapEnds(int[] nums) {
		int first = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = first;
		return nums;
	}

	public int[] midThree(int[] nums) {
		int middle = nums.length / 2;

		return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
	}

	public int maxTriple(int[] nums) {
		int first = nums[0], middle = nums[nums.length / 2], last = nums[nums.length - 1];

		if (first > middle) {
			if (first > last)
				return first;
			return last;
		}

		return middle > last ? middle : last;
	}

	public int[] frontPiece(int[] nums) {

		if (nums.length < 1)
			return new int[] {};

		if (nums.length < 2)
			return new int[] { nums[0] };

		return new int[] { nums[0], nums[1] };
	}

	public boolean unlucky1(int[] nums) {
		if (nums.length < 2)
			return false;

		if (nums[0] == 1 && nums[1] == 3)
			return true;

		if (nums[1] == 1 && nums[2] == 3)
			return true;

		if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)
			return true;

		return false;
	}

	public int[] make2(int[] a, int[] b) {
		int result[] = new int[2];

		if (a.length >= 2) {
			result[0] = a[0];
			result[1] = a[1];
			return result;
		}

		if (a.length < 2 && a.length > 0) {
			result[0] = a[0];

			if (b.length > 0) {
				result[1] = b[0];
				return result;
			}

			return result;
		}

		if (b.length >= 2) {
			result[0] = b[0];
			result[1] = b[1];
			return result;
		}

		return result;
	}

	public int[] front11(int[] a, int[] b) {
		if (a.length > 0) {
			if (b.length > 0) {
				return new int[] { a[0], b[0] };
			}
			return new int[] { a[0] };
		}

		if (b.length > 0) {
			return new int[] { b[0] };
		}

		return new int[] {};
	}

}
