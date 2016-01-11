import java.util.Scanner;
public class 제어문정리문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 1:");
		int i=scan.nextInt();
		System.out.println("정수 2:");
		int j=scan.nextInt();
		System.out.println("정수 3:");
		int k=scan.nextInt();
		
		int max=0;
		int min=100;
		int [] arr={i,j,k};
		for(int a=0;i<=2;i++){
			for(int b=i+1;b<3;b++){
				if(arr[i]<arr[j])
					arr[i]=arr[j];
			}
		}
		System.out.print(arr[i]);
	}

}
