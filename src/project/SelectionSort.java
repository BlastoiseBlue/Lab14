package project;

public class SelectionSort {
	/**
	 * Precondition: count <= a.length; The first count indexed variables have
	 * values. Action: Sorts a so that a[0] <= a[1] <= ... <= a[count - 1].
	 */
	public static void sort(int[] a, int count) {
		int index, indexOfNextSmallest;
		for (index = 0; index < count - 1; index++) {
			// Place the correct value in a[index]:
			indexOfNextSmallest = indexOfSmallest(index, a, count);
			interchange(index, indexOfNextSmallest, a);
			// //a[0]<=a[1]<=...<=a[index] and these are
			// the smallest of
			// the original array
			// elements. The remaining positions
			// contain
			// the rest of the original array elements.
		}
	}

	public static void invert(int[] a) {
		int[] a2 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a2[i] = a[a.length - 1 - i];
		}
		for (int i = 0; i < a.length; i++)
			a[i] = a2[i];
	}

	/**
	 * Returns the index of the smallest value among a[startIndex], a[startIndex+1],
	 * ... a[numberUsed - 1]
	 */
	private static int indexOfSmallest(int startIndex, int[] a, int count) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		int index;
		for (index = startIndex + 1; index < count; index++)
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
				// min is smallest of a[startIndex] through
				// a[index]
			}
		return indexOfMin;
	}

	/**
	 * Precondition: i and j are legal indices for the array a. Postcondition:
	 * Values of a[i] and a[j] have been interchanged.
	 */
	private static void interchange(int i, int j, int[] a) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp; // original value of a[i]
	}
}