import java.util.Scanner;
public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�⼮����:");
		int atn=scan.nextInt();
		if(atn>100)
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
		System.out.println("�߰�����:");
		int mid=scan.nextInt();
		if(mid>100)
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
		System.out.println("��������:");
		int quiz=scan.nextInt();
		if(quiz>100)
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
		System.out.println("�⸻����:");
		int fin=scan.nextInt();
		if(fin>100)
			System.out.println("�߸� �Է� �ϼ̽��ϴ�");
				
		
		int total=atn+mid+quiz+fin;
		System.out.println("����="+total);
		double avg=total/4.0;
		System.out.println("���="+avg);
		
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
		System.out.println("���� ����"+"  "+grade);
	}

}
