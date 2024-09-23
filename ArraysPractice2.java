package example;

public class Tester {
	public static int[] f1(int num) {
		int i;
		int copyNum=num,mostApper=0,commonNum=0;
		int[] numbers = new int[10];
		
		for(i=0; i<numbers.length; i++) {
			int apper=0,checkNum=0;
			while(num > 0) {
				checkNum = num%10;
				if(i == checkNum)
					apper++;
				num /= 10;
				if(apper > mostApper) {
					mostApper = apper;
					commonNum = checkNum;
				}
			}
			numbers[i] = apper;
			num = copyNum;
		}
		return numbers;
	}
	public static int f2(int[] grades) {
		int i,j;
		int min=100,commonGrade=0,mostApper=0;
		
		for(i=0; i<grades.length; i++) {
			int apper=0;
			for(j=0; j<grades.length; j++) {
				if(grades[i] == grades[j])
					apper++;
			}
			if(apper > mostApper) {
				commonGrade = grades[i];
				mostApper = apper;
			}
			else if(apper == mostApper) {
				if(grades[i] < commonGrade)
					commonGrade = grades[i];
			}
		}
		return commonGrade;
	}
	public static boolean f4(int n) {
		int checkNum=0;
		int[] used = new int[10];
		
		while(n > 0) {
			checkNum = n%10;
			if(used[checkNum] == checkNum)
				return false;
			used[checkNum] = checkNum;
			n /= 10;
		}
		return true;
	}
	public static void main(String[] args) {
	}
}
