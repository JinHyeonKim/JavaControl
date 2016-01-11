import java.util.Scanner;
public class 연산자와제어문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] score = new int[3];
		for(int a=0;a<score.length;a++){
			System.out.println((a+1)+"번째 점수를 입력하세요:");
			score [a]=scan.nextInt();
		}
		int total = score[0]+score[1]+score[2];
		double avg=total/(double)score.length;
		double avg2=total/3.0;
		System.out.println("총점: "+total);
		System.out.printf("length 평균:%.2f\n",avg);
		System.out.printf("그냥평균:%.2f ",avg2);
	/*	int i= 278970;
		System.out.println("10000원권: "+(i/10000)+"개");
		System.out.println("5000원권: "+(i%10000/5000)+"개");
		System.out.println("1000원권: "+(i%5000/1000)+"개");
		System.out.println("500원권: "+(i%1000/500)+"개");
		System.out.println("100원권: "+(i%500/100)+"개");
		System.out.println("50원권: "+(i%100/50)+"개");
		System.out.println("10원권: "+(i%50/20)+"개");*/
		
	}

}
