
public class Sort {
	public static void SelectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int sval = arr[i];
	
			for(int j = i+1;j<arr.length;j++) {
				//if(arr[j]>sval)
				if(arr[j]< sval) {
					int temp = arr[j];
					arr[j]= sval;
					sval = temp;
				}
				
			}
			arr[i] = sval;
		}
	}
	public static void InsertionSort(int[] arr) {
		for(int i =0; i<arr.length;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j >= 0 && temp<arr[j] ) {
				arr[j+1] = arr[j];
				j--;
			}	
			arr[j+1] = temp;
		}
	}
	public static void BubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j =0; j<arr.length-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void quickSort(int[] arr, int l, int r) {
		if(l<r) {
			int x = partition(arr, l, r);
			quickSort(arr, l, x-1);
			quickSort(arr, x+1, r);
		}
	}
	private static int partition(int[] arr, int l, int r) {
		int p = arr[r];
		int j = l;
		int i = j-1;
		while(j != r) {
			if(arr[j] < p) {
				//System.out.println("In IF "+ arr[i] + " "+ arr[j]+" "+ i +" "+ j);
				i++;
				int tem = arr[i];
				arr[i] = arr[j];
				arr[j] = tem;
			}
			j++;
		}
		//[32,43,12,2,-1]
		
		i++;
		int tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
		//System.out.println("ELsE" + arr[i]+" "+ arr[j]+" "+ i);
		
		return i;
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		
		while(l<r) {
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			Merge.merge(arr, l, r, m);
		}
	}
	
}
