import java.util.Scanner;
public class �����������12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] score=new int[10];
		for(int a=0;a<score.length;a++)
		{
			System.out.println((a+1)+"�� �л��� ������ �Է��ϼ���: ");
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
		
		System.out.println("����: "+ sum);
		System.out.println("���: "+ avg);
		System.out.println("�ִ�����: "+ max);
		System.out.println("�ּ�����: "+ min);
	}
	
}
