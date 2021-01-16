import java.util.Random;
//4. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
//Если таких чисел нет, то вывести сообщение об этом факте
public class Task4 {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = new int [n];
		
		init(arr);
		System.out.println("Исходный массив:");
		print(arr);
		
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 2 == 0) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.print("Нет чётных элементов!");
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

		System.out.println("Массив из чётных элементов:");
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
