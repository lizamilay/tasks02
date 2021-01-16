import java.util.Random;
//7. ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.
public class Task7 {
	public static void main(String[] args) {
		int n = 10;
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("�������� ������:");
		print(arr);
		
		double max = arr[0];
		double min = arr[0];
		int max_ind = 0;
		int min_ind = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( max < arr[i]) {
				max = arr[i];
				max_ind = i;
			}
			if( min > arr[i]) {
				min = arr[i];
				min_ind = i;
			}
		}
		
		double temp = max;
		arr[max_ind] = min;
		arr[min_ind] = temp;
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		System.out.println("��������� ������:");
		print(arr);
		return;
	}
	 public static void init(double[] mas) {
	    	Random rand = new Random();
	    	for( int i=0; i < mas.length; i++) {
	    		mas[i] = rand.nextDouble() * 1000;
	    	}
	    }
	    
	    public static void print(double[] mas) {
	    	
	    	for( int i=0; i < mas.length; i++) {
	    		System.out.print(mas[i] + " ");
	    	}
	    	System.out.println();
	    }
}
