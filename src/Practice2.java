import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		System.out.print("문자 : ");
		String munja = sr.nextLine();
		char ch = munja.charAt(0);
		System.out.printf("문자 %c의 코드값은 %d 입니다.", ch ,(int)ch);
	}
}
