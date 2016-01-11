/*
 * 1부터 100까지 수중의 3의 배수를 구하고, 그 합을 출력하시오
 */
public class 제어문정리문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do
		{
			if(i%3==0){
			System.out.print(i+" ");
			sum+=i;
			}
			i++;
		}while(i<=100);
	System.out.println("\n3의 배수 합:"+sum);	
	}

}
