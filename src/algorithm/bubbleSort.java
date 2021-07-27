package algorithm;

public class bubbleSort {
	public static void main(String[] args) {
		// 변수 이름 : arr 6개의 방을 선언(인덱스 값 : 0~5)
		int[] arr = new int[6];
		//제목
		System.out.println("\t<버블 정렬 알고리즘>");
		
		//랜덤값 정렬 전 모습
		System.out.println("정렬 전 : ");
		//배열 arr의 길이는 6, 즉 i는 배열 방에 들어갈 랜덤 값을 의미
		for(int i=0; i<arr.length; i++) {
			//6개의 방 안에 랜덤으로 각각 1~45까지의 값 넣어줌
			arr[i] = (int)(Math.random() * 45) + 1;
			System.out.print("[" + arr[i] + "]");
		}
		//여기서 z는 몇회전을 하느냐 결정하는 것. (회전수는 배열 크기보다 적게 돌아도 되지만 쉽게 설명하기 위해 위와 같은 값 입력)
		for(int z=0; z<arr.length; z++) {
			//j는 값을 비교하고 자리를 바꿔주는 역할.  +1로 비교하므로 -1까지만 반복문 돌리기
			for(int j=0; j<arr.length - 1; j++) {
				//만약 앞에 수가 뒤에 배열 값보다 크다면
				if(arr[j] > arr[j+1]) {
					//앞 뒤 바꿔줌
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
		//출력
		System.out.println("\n정렬 후 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print("["+arr[i]+"]");
		}
	}
}
