import java.util.Scanner;
public class �����ڿ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int [] score = new int[3];
		for(int a=0;a<score.length;a++){
			System.out.println((a+1)+"��° ������ �Է��ϼ���:");
			score [a]=scan.nextInt();
		}
		int total = score[0]+score[1]+score[2];
		double avg=total/(double)score.length;
		double avg2=total/3.0;
		System.out.println("����: "+total);
		System.out.printf("length ���:%.2f\n",avg);
		System.out.printf("�׳����:%.2f ",avg2);
	/*	int i= 278970;
		System.out.println("10000����: "+(i/10000)+"��");
		System.out.println("5000����: "+(i%10000/5000)+"��");
		System.out.println("1000����: "+(i%5000/1000)+"��");
		System.out.println("500����: "+(i%1000/500)+"��");
		System.out.println("100����: "+(i%500/100)+"��");
		System.out.println("50����: "+(i%100/50)+"��");
		System.out.println("10����: "+(i%50/20)+"��");*/
		
	}

}
