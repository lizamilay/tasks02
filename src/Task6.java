import java.util.Random;
//6. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.

public class Task6 {
	public static void main(String[] args) {
		int n = 10;
		double [] arr = new double [n];
		
		init(arr);
		System.out.println("Исходный массив:");
		print(arr);
		
		double Z = 500.0;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] > Z) {
				arr[i] = Z;
				count++;
			}
		}
		System.out.println("Изменённый массив:");
		print(arr);
		System.out.println("Количество замен = " + count);
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
