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
			if(arr[i].equals(s))
				sum += 1;
		}
		return sum;
	}
	public static boolean f9(int[] arr) {
		int i;
		
		for(i=0; i<arr.length-2; i++) {
			if(arr[i] + arr[i+1] != arr[i+2])
				return false;
		}
		return true;
	}
	public static int f10(int[] arr) {
		int i,j;
		int num=0;
		
		for(i=0; i<arr.length; i++) {
			int apper=0         ;
			for(j=0; j<arr.length; j++) {
				if(arr[i] == arr[j])
					apper++;
			}
			if(apper==2)
				num = arr[i];
		}
		return num;
	}
	public static void f11(int[] arr, int x) {
		int i,j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr.length; j++) {
				if(arr[i]+arr[j] == x)
					System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
	public static int[] f12(int[] arr, int n, int m) {
		int[] newArray;
		int i,cnt=0;
		
		for(i=0; i<arr.length; i++) {
			if(arr[i]>n && arr[i]<m)
				cnt++;
		}
		newArray = new int[cnt];
		
		int index=0;
		for(i=0; i<arr.length; i++) {
			if(arr[i]>n && arr[i]<m) {
				newArray[index] = arr[i];
				index++;
			}	
		}
		return newArray;
	}
	public static char[] f13(String[] arr) {
		int i
	}
	public static void main(String[] args) {
		int[] arr = {2,4,3,2,1,4,4};
		System.out.println(f10(arr));
	}
}
     
