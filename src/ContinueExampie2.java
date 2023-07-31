/*
 *  continue 이동문
 */
public class ContinueExampie2 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			
			if(i == 50) {
				continue; //건너뛰는 느낌
			}
			System.out.println("출력 = " +i);
			
			
		}
			
		// 1부터 100까지 홀수만 출력하시오..
		for (int i = 1; i <= 100; i+=2) {
			// if(i % 2 != 0) { 홀수 출력 !는 부정이기 때문에}
				System.out.println(i);
			}
		
		for (int i = 1; i <= 100; i++) {
			 if(i % 2 == 0) { //홀수 출력 !는 부정이기 때문에
				continue;
			 }
				System.out.println(i);
		}
		
	}

}
