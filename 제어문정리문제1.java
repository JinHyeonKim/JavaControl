/*
 * ����, ����, ���� ������ �Է� �޾� ������ ����� ���غ�����.
 */
import java.util.Scanner;
public class �����������1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		/*
		 * ������ ���� ��ϻ󿡼� �ߺ��� �̸��� ����� �� ����. 
		*/
		System.out.println("��������: ");
		int kor=scan.nextInt();
		System.out.println("��������: ");
		int eng=scan.nextInt();
		System.out.println("��������: ");
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		System.out.println("������:"+total+"�Դϴ�.");
		System.out.printf("�����:%.2f",avg);
		
	}

}
