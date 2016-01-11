import java.util.Scanner;
public class 학점계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("출석점수:");
		int atn=scan.nextInt();
		if(atn>100)
			System.out.println("잘못 입력 하셨습니다");
		System.out.println("중간시험:");
		int mid=scan.nextInt();
		if(mid>100)
			System.out.println("잘못 입력 하셨습니다");
		System.out.println("쪽지시험:");
		int quiz=scan.nextInt();
		if(quiz>100)
			System.out.println("잘못 입력 하셨습니다");
		System.out.println("기말시험:");
		int fin=scan.nextInt();
		if(fin>100)
			System.out.println("잘못 입력 하셨습니다");
				
		
		int total=atn+mid+quiz+fin;
		System.out.println("총점="+total);
		double avg=total/4.0;
		System.out.println("평균="+avg);
		
		char grade='A';
		if(avg>=90.0 && avg<101)
			grade='A';
		else if(avg>=80.0)
			grade='B';
		else if(avg>=70.0)
			grade='C';
		else if(avg>=60.0)
			grade='D';
		else
			grade='F';
		System.out.println("너의 학점"+"  "+grade);
	}

}
