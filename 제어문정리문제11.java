/*
 * ������ ���� �Է¹޾� �Է¹��� ������ ���� ���� ������
 */
import java.util.Scanner;
public class �����������11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int i=scan.nextInt();
		int j=1;
		int sum=0;
		while(j<=i){
			sum+=j;
			j++;
		}
		System.out.println(sum);
	}

}
