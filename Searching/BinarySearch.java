public class Searching {
	
	// Iterating approach
	public static int binarySearch(int arr[], int x) {
		int low = 0;
		int hi = arr.length-1;
		while(hi >= low) {
			int mid = (hi + low)/2;
			if(x == arr[mid]) {
				return mid;
			} else if(x > arr[mid]) {
				low = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;
	}
	
	// Recursive approach
	public static int binarySearchRecursive(int arr[], int low, int hi, int x) {
		if(low > hi) {
			return -1;
		}
		int mid = (hi + low)/2;
		if(x == arr[mid]) {
			return mid;
		} else if(x > arr[mid]) {
			return binarySearchRecursive(int arr[], mid+1, hi, x);
		} else {
			return binarySearchRecursive(int arr[], low, mid-1, x);
		}
	}
	
}
	
