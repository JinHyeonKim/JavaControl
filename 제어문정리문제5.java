/*
 * 국어,영어 점수 입력 받아 학점 구하기
 */
import java.util.Scanner;
public class 제어문정리문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어:");
		int kor=scan.nextInt();
		System.out.println("영어:");
		int eng=scan.nextInt();
		int avg=(kor+eng)/2;
		
		if(avg>=90)
			System.out.println("학점:A");
		else if(avg>=80)
			System.out.println("학점:B");
		else if(avg>=70)
			System.out.println("학점:C");
		else if(avg>=60)
			System.out.println("학점:D");
		else
			System.out.println("학점:F");
	}

}
