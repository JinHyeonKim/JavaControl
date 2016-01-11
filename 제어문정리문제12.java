import java.util.Scanner;
public class 제어문정리문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] score=new int[10];
		for(int a=0;a<score.length;a++)
		{
			System.out.println((a+1)+"번 학생의 점수를 입력하세요: ");
			score[a]= scan.nextInt();
		}
		int max=0;
		int min=100;
		for(int b=0;b<score.length;b++){
			if(max<score[b])
				max=score[b];
			if(min>score[b])
				min=score[b];
		}
		int sum=0;
		for(int c=0;c<score.length;c++){
			sum+=score[c];
		}
		double avg=sum/10.0;
		
		System.out.println("총합: "+ sum);
		System.out.println("평균: "+ avg);
		System.out.println("최대점수: "+ max);
		System.out.println("최소점수: "+ min);
	}
	
}
