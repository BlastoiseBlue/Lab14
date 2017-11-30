package project;

public class Driver {
	static boolean belongsTo(int[] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				return true;
		}
		return false;
	}

	static int[][] getDistinct(int[] arr) {
		int[] arr2 = new int[arr.length];
		int n = 0;
		for (int i = 0; i < arr.length; i++)
			arr2[i] = -1;
		for (int i = 0; i < arr.length;i++) {
			if (!belongsTo(arr2, arr[i])) {
				arr2[i] = arr[i];
				if (arr2[i] >= 0)
					n++;
			}
		}
		SelectionSort.sort(arr2, arr2.length);
		int[][] arr3 = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr3[i][0] = arr2[i];
			arr3[i][1] = findNumberOfOccurrences(arr, arr2[i]);
		}
		return arr3;
	}

	static int findNumberOfOccurrences(int[] arr, int x) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				n++;
		}
		return n;
	}

	static void output(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static void output(int[][] arr) {
		System.out.println("N	Count");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + "	" + arr[i][1]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 4, 5, 6, 4, 2, 3, 7 };
		output(arr);
		int[][] arrD = getDistinct(arr);
		output(arrD);
	}

}
