/*
 * ����,���� ���� �Է� �޾� ���� ���ϱ�
 */
import java.util.Scanner;
public class �����������5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("����:");
		int kor=scan.nextInt();
		System.out.println("����:");
		int eng=scan.nextInt();
		int avg=(kor+eng)/2;
		
		if(avg>=90)
			System.out.println("����:A");
		else if(avg>=80)
			System.out.println("����:B");
		else if(avg>=70)
			System.out.println("����:C");
		else if(avg>=60)
			System.out.println("����:D");
		else
			System.out.println("����:F");
	}

}
