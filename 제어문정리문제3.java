/*
 * for문을 사용해서 1부터 100까지 수중 짝수합, 홀수합을 구해보세요.
 */
public class 제어문정리문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=100;i++){
			if(i%2==0)
				sum1+=i;
			if(i%2==1)
				sum2+=i;
		}
		System.out.println("홀수의 합은:"+sum2);
		System.out.println("짝수의 합은:"+sum1);
	}

}
