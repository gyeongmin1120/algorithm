package algorithm;

//public class selectionSort {
//	public void sort(int[] data){
//		int size = data.length;
//		//최소값을 가진 데이터의 인덱스 저장 변수
//		int min; 
//		int temp;
//		
//		//size-1 : 마지막 요소는 자연스럽게 정렬됨
//		for(int i=0; i<size-1; i++){ 
//			min = i;
//			for(int j=i+1; j<size; j++){
//				if(data[min] > data[j]){
//					min = j;
//				}
//			}
//			temp = data[min];
//			data[min] = data[i];
//			data[i] = temp;
//		}
//	}
//	public static void main(String[] args) {
//
//		selectionSort selection = new selectionSort();
//
//		int data[] = {66, 10, 1, 99, 5};
//
//		selection.sort(data);
//
//		for(int i=0; i<data.length; i++){
//			System.out.println("data["+i+"] : " + data[i]);
//		}
//	}
//}

public class selectionSort {
	 
	public static void selection_sort(int[] a) {
		selection_sort(a, a.length);
	}
	
	private static void selection_sort(int[] a, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			int min_index = i;	
			
			// 최솟값을 갖고있는 인덱스 찾기 
			for(int j = i + 1; j < size; j++) {
				if(a[j] < a[min_index]) {
					min_index = j;
				}
			}
			
			// i번째 값과 찾은 최솟값을 서로 교환 
			swap(a, min_index, i);
		}
	}
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args) {
		
		int data[] = {7, 3, 2, 8, 9, 4, 6, 1, 5};

		selection_sort(data);

		for(int i=0; i<data.length; i++){
			System.out.println("data["+i+"] : " + data[i]);
		}
	}
}