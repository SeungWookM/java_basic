
public class EcilpseExample {

	public static void main(String[] args) {
		String message = "이클립스연습입니다..";
		int age = 40;
		double weight = 69.5;
		System.out.println(message);
		System.out.println(age);
		System.out.println(weight);

		System.err.println("에러내용입니다.");

//	    이스케이스 문자 처리
		String message1 = "\"자바\"는 웹애플리케이션 개발 \'최강\' 언어입니다..";
		System.out.println(message1);
		String path = "C:\\a\\b\\c\\some.txt";
		System.out.println(path);

//	    제어문자
		String message2 = "안녕하세요.\n문승욱입니다.\b";
		System.out.println(message2);

		String header = "번호\t이름\t나이";
		System.out.println(header);

//	    boolean
		boolean isMan = false;
//	    boolean flag = 0; 컴파일에러
		System.out.println(isMan);

//	    int double boolean 제일 쓴다.

	}
}
