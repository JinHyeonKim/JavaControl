/*
 * 1���� 100���� ������ 3�� ����� ���ϰ�, �� ���� ����Ͻÿ�
 */
public class �����������10 {

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
	System.out.println("\n3�� ��� ��:"+sum);	
	}

}
