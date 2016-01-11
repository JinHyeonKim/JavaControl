/* 
 * 임의의 수를 입력받아 짝수인지 홀수인지 출력해 보세요.
 */
import java.util.Scanner;
public class 제어문정리문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력:");
		int num=scan.nextInt();
		
		if(num%2==0)
			System.out.println(num+"는(은) 짝수");
		else
			System.out.println(num+"는(은) 홀수");
	}
}