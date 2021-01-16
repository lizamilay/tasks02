import java.util.Random;
//4. ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ �� ������ ����� ���� ������������������.
//���� ����� ����� ���, �� ������� ��������� �� ���� �����
public class Task4 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = new int [n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 2 == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.print("��� ������ ���������!");
			return;
		}
		
		int [] res = new int [count];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 2 == 0) {
				res[j] = arr[i];
				j++;
			}
		}

		System.out.println("������ �� ������ ���������:");
		print(res);
		return;
	}
    public static void init(int[] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		mas[i] = rand.nextInt(1000);
    	}
    }
    
    public static void print(int[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
}
