/*
 * for���� ����ؼ� 1���� 100���� ���� ¦����, Ȧ������ ���غ�����.
 */
public class �����������3 {

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
		System.out.println("Ȧ���� ����:"+sum2);
		System.out.println("¦���� ����:"+sum1);
	}

}
