/*
 * 1에서 100까지의 값 중에 난수 하나를 발생시키고, 1부터 난수까지의 합을 구하기
 */
public class 제어문정리문제17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*100)+1;
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("입력값: "+num);
		System.out.println("1~"+num+"까지의 합: "+sum);
	}

}
