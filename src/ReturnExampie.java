/*
 *  break 이동문
 */
public class ReturnExampie {

	public static void main(String[] args) {
		System.out.println("자바 프로그램 시작됨...");
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				//break;
				//continue;
				return;
				
			}
			System.out.println(i);
		}
		System.out.println("자바프로그램 종료됨...");

	}//여기가 리턴(메소드를 끝낸다.)

}
