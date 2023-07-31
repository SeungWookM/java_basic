/*
 * 조건(분가)문 Switch
 */
public class SwitchExample {

	public static void main(String[] args) {

		int num = 7;
		switch (num) {
		case 1:
			System.out.println("1입니다..");
			break;
		case 2:
			System.out.println("2입니다..");
			break;
		case 3:
			System.out.println("3입니다..");
			break;
		case 4:
			System.out.println("4입니다..");
			break;
		case 5:
			System.out.println("5입니다..");
			break;
		default:
			System.out.println("일치하는 값이 없습니다..");

		}

		int score = 88;
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
		}

		int x = 50, y = 30;
		char operator = '+';
		switch (operator) {
		case '+':
			System.out.println("덧셈 =" + (x + y));
			break;
		case '-':
			System.out.println("뺄셈 =" + (x - y));
			break;
		case '*':
			System.out.println("곱셈 =" + (x * y));
			break;
		case '/':
			System.out.println("나눗셈 =" + (x / y));
			break;

		default:
			break;
		}
	}

}
