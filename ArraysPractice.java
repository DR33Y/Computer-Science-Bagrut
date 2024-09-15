package example;

public class Tsester {
	public static boolean f1(int[] arr, int k) {
		int i, sum=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0)
				sum += arr[i];
		}
		if (sum%k == 0)
			return true;
		return false;
	}
	public static boolean f2(int[] arr, int k) {
		int i, min = 2147483647;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
		if(k==min)
			return true;
		return false;
	}
	public static boolean f3(int[] arr) {
		int i;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i]<10 || arr[i]%2 == 0)
				return false;
		}
		return true;
	}
	public static boolean f4(String[] arr) {
		int i;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i].charAt(0) != arr[i].charAt(arr[i].length()-1))
				return false;
		}
		return true;
	}
	public static int f5(String[] arr, String s) {
		int i, sum=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i].compareTo(s) == 0)
				sum += 1;
		}
		return sum;
	}
	public static void main(String[] args) {
		String[] arr = {"ana", "bara", "amalia"};
		System.out.println(f4(arr));
	}
}
     
