/*
 * 반복문 While
 */
public class WhileExample {

	public static void main(String[] args) {

		int index = 0;
		while (index < 100) {
			System.out.println("김기정 바보!!!!");
			index++;
		}

		index = 1;
		int result = 0, oddSum = 0, evenSum = 0;
		while (index <= 100) {
			result = result += index;

			if ((index % 2) == 0) {
				evenSum += index;
			} else {
				oddSum += index;
			}
			index++;
		}
		System.out.println("누적합 : " + result);
		System.out.println("홀수 합 : " + oddSum);
		System.out.println("짝수 합 : " + evenSum);

		// 위에꺼 간략하게
//			int oddSum = 0, evenSum = 0;
//			index = 1;
//			while (index <= 100) {
//			
//			if((index % 2) == 0) {
//				evenSum += index;
//			}else {
//				oddSum += index;
//			}
//			index++;
//			}
//			System.out.println("누적합 : " + (oddSum+evenSum));
//			System.out.println("홀수 합 : " + oddSum);
//			System.out.println("짝수 합 : " + evenSum);

		// do while문
		index = 0;
		do {
			System.out.println("풀스텍 웹 개발자과정 화이팅!!!!");
			index++; // 값을 증가 시켜 무한으로 작동하는 하는것을 멈춤
		} while (index < 100);

	}
}