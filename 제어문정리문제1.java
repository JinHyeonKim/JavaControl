/*
 * 국어, 영어, 수학 점수를 입력 받아 총점과 평균을 구해보세요.
 */
import java.util.Scanner;
public class 제어문정리문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * 변수는 같은 블록상에서 중복된 이름을 사용할 수 없다. 
		*/
		System.out.println("국어점수: ");
		int kor=scan.nextInt();
		System.out.println("영어점수: ");
		int eng=scan.nextInt();
		System.out.println("수학점수: ");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("총점은:"+total+"입니다.");
		System.out.printf("평균은:%.2f",avg);
		
	}

}
