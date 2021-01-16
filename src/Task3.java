import java.util.Random;
//3. ���� ������������������ �������������� ����� �1 �2 ,..., �n . ��������, ����� �� ��� ������������.
public class Task3 {
	public static void main(String[] args) {
		int n = 3;
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			if( arr[i] >= arr[i+1]) {
				System.out.println("������������������ �� ������������!");	
				return;
			}
		}
		System.out.println("������������������ ������������!");	
		return;
	}
    public static void init(double[] mas) {
    	Random rand = new Random();
    	for( int i=0; i < mas.length; i++) {
    		mas[i] = rand.nextDouble()*1000;
    	}
    }
    
    public static void print(double[] mas) {
    	
    	for( int i=0; i < mas.length; i++) {
    		System.out.print(mas[i] + " ");
    	}
    	System.out.println();
    }
}
