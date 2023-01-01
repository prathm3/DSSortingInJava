
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {32,43,12,2,-1};
		Sort.SelectionSort(arr);
		//Sort.InsertionSort(arr);
		//Sort.BubbleSort(arr);
		//Sort.quickSort(arr, 0, 4);
		//Sort.mergeSort(arr, 0, 5);
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
