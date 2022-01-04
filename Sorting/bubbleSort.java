public class BubbleSorting {
	
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			boolean flag = true;
			for(int j = 0; j < n-i-1; j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = false;
				}
			}
			if(flag) {
				return;
			}
		}
	}
	
	
	
}
