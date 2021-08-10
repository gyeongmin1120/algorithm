package algorithm;

public class insertionSort {
	public static void insertion_sort(int[] a) {
		insertion_sort(a, a.length);
	}
	
	private static void insertion_sort(int[] a, int size) {
		
		for(int i = 1; i < size; i++) {
			//타겟 넘버
			int target = a[i];
			int j = i-1;
			//타겟이 이전 원소보다 크기 전까지 반복
			while(j >= 0 && target < a[j]) {
				//이전 원소를 한 칸 씩 뒤로 미룸
				a[j+1] = a[j];
				j--;
			}
			
			/*
			 * 위 반복문에서 탈출하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
			 * 타겟 원소는 j번째 원소 뒤에 와야 함.
			 * 그러므로 타겟은 j+1에 위치하게 됨.
			 * */
			a[j+1] = target;
		}
	}
	
	public static void main(String[] args) {
		int array[] = {1,19,7,60,78,53,4,34,42};
		
		insertion_sort(array);
		
		for(int i=0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
