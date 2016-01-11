/*
 * for문을 사용해서 1부터 50까지 수 중에 5의 배수를 출력하고, 5의 배수의 합도 구해보시오.
 */
public class 제어문정리문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=50;i++){
			if(i%5==0){
				System.out.print(i+"\t");
				sum+=i;
			}
		}
		System.out.println("\n5의 배수 합:"+sum);
	}

}
