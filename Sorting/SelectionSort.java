public class SelectionSorting {
    public static int selectionSort(int arr[]) {
		int n = arr.length;
		int maxInd = 0;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-i-1; j++) {
				maxInd = 0;
				if(arr[j] > arr[maxInd]) {
					maxInd = j;
				}
			}
			int temp = arr[j];
			arr[j] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
    }
}
