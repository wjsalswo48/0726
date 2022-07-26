import java.util.Scanner;

public class Studentinfo2 {
	public static void main(String[] args) {
//		Student minjae = new Student();
//		Scanner sr = new Scanner(System.in);
//		minjae.name=sr.nextLine();
//		minjae.hakbun=sr.nextLine();
//		minjae.kor=sr.nextInt();
//		minjae.eng=sr.nextInt();
//		minjae.mat=sr.nextInt();
		
		Student mjun = new Student();
		mjun.name = "엠준";
		mjun.hakbun = "1450513";
		mjun.kor=80;
		mjun.eng=100;
		mjun.mat=85;
		int total = mjun.kor + mjun.eng + mjun.mat;
		double avg = (double)total/3;
		System.out.printf("이름 : %s, 학번 : %s, 국어 : %d, 영어 : %d, 수학 : %d \n",mjun.name,mjun.hakbun,mjun.kor,mjun.eng,mjun.mat );
		System.out.printf("총점 : %d, 평균 : %2.4f", total, avg);
	}
}


class Student{ //객체의 설계도
	String name;
	String hakbun;
	int kor;
	int eng;
	int mat;
}