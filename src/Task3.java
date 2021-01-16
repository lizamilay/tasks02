import java.util.Random;
//3. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
public class Task3 {
	public static void main(String[] args) {
		int n = 3;
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("Исходный массив:");
		print(arr);
		
		
		for(int i = 0; i < arr.length - 1; i++) {
			if( arr[i] >= arr[i+1]) {
				System.out.println("Последовательность не возрастающая!");	
				return;
			}
		}
		System.out.println("Последовательность возрастающая!");	
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
