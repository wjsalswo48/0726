import java.util.Scanner;

public class Studentinfo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("귀하의 키는 :");
		double height = sc.nextDouble();
		
		System.out.print("귀하의 몸무게는 :");
		double weight = sc.nextDouble();
		
		System.out.print("키와 몸무게 :"+height+","+weight+"\n");
		
		System.out.print("귀하의 키는 :");
		height = sc.nextDouble();
		
		System.out.print("귀하의 몸무게는 :");
		weight = sc.nextDouble();
	}
}
