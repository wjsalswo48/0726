
/*
 * 과제시 추가해야할 주석
 * 누가
 * 언제
 * 만든 목적
 * 작성환경(OS : Mac Os, JDK Version : OpenJdk 11.0.16, Editor : Eclipse 2022-06)
*/
import java.util.Scanner;

public class Studentinfo {
	public static void main(String [] args) { //프로그램의 시작과 끝
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("학생 이름 :");
		String name = sc.nextLine();
		
		System.out.print("학번 :");
		String hakbun = sc.nextLine();
		
		System.out.print("주소 :");
		String adress = sc.nextLine();
		
		System.out.println("이름 :"+name);
		System.out.println("학번 :"+hakbun);
		System.out.println("주소 :"+adress);
		
	}
}
