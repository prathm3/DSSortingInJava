
public class Merge {
	public static void merge(int[] crr , int l, int r, int m) {
		/*
		 * int l = 0; int r = crr.length-1; int m = (l+r)/2;
		 */
		
		int[] arr = new int[m-l+1];
		int[] brr = new int[r-m-1+1];
		int j=0, i=0, k=l;
		for(int n =0; n<arr.length; n++) {
			arr[n] = crr[n+k];
		}
		for(int n =0; n<brr.length; n++) {
			brr[n] = crr[m+1+n];
		}
		
		while(i<arr.length && j<brr.length) {
			if(arr[i] <= brr[j]) {
				crr[k] = arr[i];
				i++;
				
			}else {
				crr[k]= brr[j];
				j++;
			}
			k++;
		}
		while(i<arr.length) {
			crr[k] = arr[i];
			i++;
			k++;
		}
		while(j<brr.length) {
			crr[k] = brr[j];
			j++;
			k++;
		}
	}
}
