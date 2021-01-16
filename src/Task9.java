import java.util.Random;
//9. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

public class Task9 {
	public static void main(String[] args) {
		int n = 10;
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("Исходный массив:");
		print(arr);
		
		int count_neg = 0;
		int count_pos = 0;
		int count_zer = 0;
		
		arr[0] = 0.0;
		arr[1] = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				count_neg++;
			}
			else {
				if(arr[i] > 0) {
					count_pos++;
				}
				else {
					count_zer++;
				}
			}
		}
		
		System.out.println("Количество отрицательных = " + count_neg );
		System.out.println("Количество положительных = " + count_pos );
		System.out.println("Количество нулей = " + count_zer);
		return;
	}
	 public static void init(double[] mas) {
	    	Random rand = new Random();
	    	for( int i=0; i < mas.length; i++) {
	    		mas[i] = rand.nextDouble() * 100 - 50;
	    	}
	    }
	    
	    public static void print(double[] mas) {
	    	
	    	for( int i=0; i < mas.length; i++) {
	    		System.out.print(mas[i] + " ");
	    	}
	    	System.out.println();
	    }
}
