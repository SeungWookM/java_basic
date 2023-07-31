/*
 *  break 이동문
 */
public class LabelExampie {

	public static void main(String[] args) {
		
		OUT: //레이블 선언. 잘 사용하진 않음.(올 대문자로 쓰는것이 관례)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if (j == 5) {
					//break;
					break OUT;
				}
			}
		}

		
	}

}
