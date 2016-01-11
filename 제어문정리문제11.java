/*
 * 임의의 수를 입력받아 입력받은 수까지 합을 구해 보세요
 */
import java.util.Scanner;
public class 제어문정리문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
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
