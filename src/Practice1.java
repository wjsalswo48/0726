import java.util.*;
public class Practice1 {
	public static void main(String[] args) {
		Student minjae = new Student();
		Scanner sr = new Scanner(System.in);
		System.out.print("귀하의 이름은?");
		minjae.name=sr.nextLine();
		System.out.print("귀하의 학번은?");
		minjae.hakbun=sr.nextLine();
		System.out.print("귀하의 국어점수는?");
		minjae.kor=sr.nextInt();
		System.out.print("귀하의 영어점수는?");
		minjae.eng=sr.nextInt();
		System.out.print("귀하의 수학점수는?");
		minjae.mat=sr.nextInt();
		int total = minjae.kor+minjae.eng+minjae.mat;
		double avg=(double)total/3;
		System.out.printf("이름 : %s \n",minjae.name);
		System.out.printf("학번 : %s \n",minjae.hakbun);
		System.out.printf("국어 : %d \n",minjae.kor);
		System.out.printf("수학 : %d \n",minjae.eng);
		System.out.printf("영어 : %d \n",minjae.mat);
		System.out.printf("총점 : %d \n",total);
		System.out.printf("평균 : %.2f \n", avg);
	}
}
