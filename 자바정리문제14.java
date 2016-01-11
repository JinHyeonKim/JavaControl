//1~100 짝수의 개수, 홀수의 개수
/*
 * 1~100까지 루프(반복문) ******* 1)첫번째 기술 면접 문제
 * 1) for: 반복횟수지정
 * 2) while: 반복 횟수가 지정이 없는 경우 ==> 선조건
 * 3) do~while: 반드시 한번 이상 수행 ==> 후조건
 */
public class 자바정리문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count1=0;
		int count2=0;
		for(int a=1;a<=100;a++){
			if(a%2==0)
				count1++;
			else
				count2++;
		}
		System.out.println("짝수갯수: "+count1);
		System.out.println("홀수갯수: "+count2);
		/*
		 * 단항연산자
		 * 	= 증감연산자(++,--)
		 * 	   한개 증가, 감소
		 * 	=> 전치 연산자
		 * 		++a => 증가 후 다른 연산 수행
		 * 		int a=10;
		 * 		int b=++a;
		 * 		1) ++a
		 * 		2) b=a
		 * 	=> 후치 연산자
		 * 		a++ => 다른 연산 수행 후 증가
		 * 		int a=10;
		 * 		int b=a++;
		 * 		1) b=a
		 * 		2) a++
		 * 	= 부정연산자(!):  boolean
		 * 		true => false
		 * 		false => true
		 */
	}

}
