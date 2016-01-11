import java.util.Scanner;
public class 제어문정리문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("단입력:");
		int dan=scan.nextInt();
		
		for(int i=1;i<10;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
	}

}
