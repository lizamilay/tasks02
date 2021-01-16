import java.util.Random;
//� ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
public class Task1 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = new int [n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		int K = 5;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % K == 0) {
				System.out.println(arr[i] + " ������ " + K);
				sum = sum + arr[i];
			}
		}
		System.out.print("����� ���� �������� �������, ������� " + K + " = " + sum);
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
