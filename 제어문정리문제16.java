/*
 * 난수 5개를 생성하여 최대값과 최소값을 구해보라
 */
public class 제어문정리문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val=new int[5];
		int max=0, min=100;
		for(int i=0;i<5;i++){
			val[i]=(int)(Math.random()*100)+1;
			System.out.print(val[i]+" ");
		}
		System.out.println();
		for(int i=0;i<5;i++){
			if(max<val[i])
				max=val[i];
			if(min>val[i])
				min=val[i];
		}
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
	}

}
