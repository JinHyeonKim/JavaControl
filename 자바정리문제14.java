//1~100 ¦���� ����, Ȧ���� ����
/*
 * 1~100���� ����(�ݺ���) ******* 1)ù��° ��� ���� ����
 * 1) for: �ݺ�Ƚ������
 * 2) while: �ݺ� Ƚ���� ������ ���� ��� ==> ������
 * 3) do~while: �ݵ�� �ѹ� �̻� ���� ==> ������
 */
public class �ڹ���������14 {

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
		System.out.println("¦������: "+count1);
		System.out.println("Ȧ������: "+count2);
		/*
		 * ���׿�����
		 * 	= ����������(++,--)
		 * 	   �Ѱ� ����, ����
		 * 	=> ��ġ ������
		 * 		++a => ���� �� �ٸ� ���� ����
		 * 		int a=10;
		 * 		int b=++a;
		 * 		1) ++a
		 * 		2) b=a
		 * 	=> ��ġ ������
		 * 		a++ => �ٸ� ���� ���� �� ����
		 * 		int a=10;
		 * 		int b=a++;
		 * 		1) b=a
		 * 		2) a++
		 * 	= ����������(!):  boolean
		 * 		true => false
		 * 		false => true
		 */
	}

}
